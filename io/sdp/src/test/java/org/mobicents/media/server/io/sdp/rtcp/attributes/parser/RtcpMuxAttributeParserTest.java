/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.mobicents.media.server.io.sdp.rtcp.attributes.parser;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author Henrique Rosa (henrique.rosa@telestax.com)
 *
 */
public class RtcpMuxAttributeParserTest {

	private final RtcpMuxAttributeParser parser = new RtcpMuxAttributeParser();
	
	@Test
	public void testCanParse() {
		// given
		String sdp1 = "a=rtcp-mux\n\r";
		String sdp2 = "x=rtcp-mux\n\r";
		String sdp3 = "a=rtcp\n\r";
		
		// when
		boolean canParseSdp1 = parser.canParse(sdp1);
		boolean canParseSdp2 = parser.canParse(sdp2);
		boolean canParseSdp3 = parser.canParse(sdp3);
		
		// then
		Assert.assertTrue(canParseSdp1);
		Assert.assertFalse(canParseSdp2);
		Assert.assertFalse(canParseSdp3);
	}
	
}
