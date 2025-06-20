package org.whispersystems.curve25519.java;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class sc_muladd {
    public static long load_3(byte[] bArr, int i) {
        return ((bArr[i + 2] << 16) & 16711680) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280);
    }

    public static long load_4(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & 4278190080L) | (bArr[i] & 255) | ((bArr[i + 1] << 8) & 65280) | (16711680 & (bArr[i + 2] << 16));
    }

    public static void sc_muladd(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long load_3 = load_3(bArr2, 0) & 2097151;
        long load_4 = load_4(bArr2, 2) >>> 5;
        long load_32 = load_3(bArr2, 5) >>> 2;
        long load_42 = load_4(bArr2, 7) >>> 7;
        long load_43 = load_4(bArr2, 10) >>> 4;
        long load_33 = load_3(bArr2, 13) >>> 1;
        long load_44 = load_4(bArr2, 15) >>> 6;
        long load_34 = load_3(bArr2, 18) >>> 3;
        long load_35 = load_3(bArr2, 21) & 2097151;
        long load_45 = load_4(bArr2, 23) >>> 5;
        long load_36 = load_3(bArr2, 26) >>> 2;
        long load_46 = load_4(bArr2, 28) >>> 7;
        long load_37 = load_3(bArr3, 0) & 2097151;
        long load_47 = load_4(bArr3, 2) >>> 5;
        long load_38 = load_3(bArr3, 5) >>> 2;
        long load_48 = load_4(bArr3, 7) >>> 7;
        long load_49 = load_4(bArr3, 10) >>> 4;
        long load_39 = load_3(bArr3, 13) >>> 1;
        long load_410 = load_4(bArr3, 15) >>> 6;
        long load_310 = load_3(bArr3, 18) >>> 3;
        long load_311 = load_3(bArr3, 21) & 2097151;
        long load_411 = load_4(bArr3, 23) >>> 5;
        long load_312 = load_3(bArr3, 26) >>> 2;
        long load_412 = load_4(bArr3, 28) >>> 7;
        long load_313 = load_3(bArr4, 0) & 2097151;
        long load_413 = load_4(bArr4, 2) >>> 5;
        long j = load_411 & 2097151;
        long j2 = load_410 & 2097151;
        long j3 = load_39 & 2097151;
        long j4 = load_49 & 2097151;
        long j5 = load_48 & 2097151;
        long j6 = load_38 & 2097151;
        long j7 = load_47 & 2097151;
        long j8 = load_36 & 2097151;
        long j9 = load_45 & 2097151;
        long j10 = load_44 & 2097151;
        long j11 = load_33 & 2097151;
        long j12 = load_43 & 2097151;
        long j13 = load_42 & 2097151;
        long j14 = load_32 & 2097151;
        long j15 = load_4 & 2097151;
        long j16 = load_312 & 2097151;
        long load_314 = (load_3(bArr4, 5) >>> 2) & 2097151;
        long load_414 = (load_4(bArr4, 7) >>> 7) & 2097151;
        long load_415 = (load_4(bArr4, 10) >>> 4) & 2097151;
        long load_315 = (load_3(bArr4, 13) >>> 1) & 2097151;
        long load_416 = (load_4(bArr4, 15) >>> 6) & 2097151;
        long load_316 = load_3(bArr4, 18) >>> 3;
        long load_317 = load_3(bArr4, 21) & 2097151;
        long load_417 = (load_4(bArr4, 23) >>> 5) & 2097151;
        long j17 = load_3 * load_37;
        long j18 = j15 * load_37;
        long j19 = j14 * load_37;
        long j20 = j13 * load_37;
        long j21 = j12 * load_37;
        long j22 = j11 * load_37;
        long j23 = j10 * load_37;
        long j24 = load_3 * load_310;
        long j25 = load_34 * load_37;
        long j26 = load_3 * load_311;
        long j27 = j15 * load_310;
        long j28 = load_35 * load_37;
        long j29 = j15 * load_311;
        long j30 = j14 * load_310;
        long j31 = load_34 * j6;
        long j32 = j9 * load_37;
        long j33 = j14 * load_311;
        long j34 = j13 * load_310;
        long j35 = load_35 * j6;
        long j36 = j8 * load_37;
        long j37 = j13 * load_311;
        long j38 = j12 * load_310;
        long j39 = load_34 * j4;
        long j40 = load_37 * load_46;
        long j41 = j12 * load_311;
        long j42 = j11 * load_310;
        long j43 = load_46 * j7;
        long j44 = j11 * load_311;
        long j45 = j10 * load_310;
        long j46 = load_34 * j2;
        long j47 = load_46 * j6;
        long j48 = j10 * load_311;
        long j49 = load_34 * load_310;
        long j50 = load_46 * j5;
        long j51 = load_34 * load_311;
        long j52 = load_35 * load_310;
        long j53 = load_46 * j4;
        long j54 = load_35 * load_311;
        long j55 = j9 * load_310;
        long j56 = load_46 * j3;
        long j57 = load_34 * j16;
        long j58 = j9 * load_311;
        long j59 = j8 * load_310;
        long j60 = load_46 * j2;
        long j61 = j8 * load_311;
        long j62 = load_310 * load_46;
        long j63 = load_311 * load_46;
        long j64 = load_46 * j;
        long j65 = load_46 * j16;
        long j66 = load_46 * load_412;
        long j67 = load_313 + j17;
        long j68 = (j67 + 1048576) >> 21;
        long j69 = load_314 + (load_3 * j6) + (j15 * j7) + j19;
        long j70 = (j69 + 1048576) >> 21;
        long j71 = j70 << 21;
        long j72 = load_415 + (load_3 * j4) + (j15 * j5) + (j14 * j6) + (j13 * j7) + j21;
        long j73 = (j72 + 1048576) >> 21;
        long j74 = load_416 + (load_3 * j2) + (j15 * j3) + (j14 * j4) + (j13 * j5) + (j12 * j6) + (j11 * j7) + j23;
        long j75 = (j74 + 1048576) >> 21;
        long j76 = j75 << 21;
        long j77 = load_317 + j26 + j27 + (j14 * j2) + (j13 * j3) + (j12 * j4) + (j11 * j5) + (j10 * j6) + (load_34 * j7) + j28;
        long j78 = (j77 + 1048576) >> 21;
        long load_318 = ((load_3(bArr4, 26) >>> 2) & 2097151) + (load_3 * j16) + (j15 * j) + j33 + j34 + (j12 * j2) + (j11 * j3) + (j10 * j4) + (load_34 * j5) + j35 + (j9 * j7) + j36;
        long j79 = (load_318 + 1048576) >> 21;
        long j80 = (j15 * load_412) + (j14 * j16) + (j13 * j) + j41 + j42 + (j10 * j2) + (load_34 * j3) + (load_35 * j4) + (j9 * j5) + (j8 * j6) + j43;
        long j81 = (j80 + 1048576) >> 21;
        long j82 = (j13 * load_412) + (j12 * j16) + (j11 * j) + j48 + j49 + (load_35 * j2) + (j9 * j3) + (j8 * j4) + j50;
        long j83 = (j82 + 1048576) >> 21;
        long j84 = (j11 * load_412) + (j10 * j16) + (load_34 * j) + j54 + j55 + (j8 * j2) + j56;
        long j85 = (j84 + 1048576) >> 21;
        long j86 = (load_34 * load_412) + (load_35 * j16) + (j9 * j) + j61 + j62;
        long j87 = (j86 + 1048576) >> 21;
        long j88 = (j9 * load_412) + (j8 * j16) + j64;
        long j89 = (j88 + 1048576) >> 21;
        long j90 = (j66 + 1048576) >> 21;
        long j91 = (load_413 & 2097151) + (load_3 * j7) + j18 + j68;
        long j92 = (j91 + 1048576) >> 21;
        long j93 = load_414 + (load_3 * j5) + (j15 * j6) + (j14 * j7) + j20 + j70;
        long j94 = (j93 + 1048576) >> 21;
        long j95 = load_315 + (load_3 * j3) + (j15 * j4) + (j14 * j5) + (j13 * j6) + (j12 * j7) + j22 + j73;
        long j96 = (j95 + 1048576) >> 21;
        long j97 = load_316 + j24 + (j15 * j2) + (j14 * j3) + (j13 * j4) + (j12 * j5) + (j11 * j6) + (j10 * j7) + j25 + j75;
        long j98 = (j97 + 1048576) >> 21;
        long j99 = j98 << 21;
        long j100 = load_417 + (load_3 * j) + j29 + j30 + (j13 * j2) + (j12 * j3) + (j11 * j4) + (j10 * j5) + j31 + (load_35 * j7) + j32 + j78;
        long j101 = (j100 + 1048576) >> 21;
        long load_418 = (load_4(bArr4, 28) >>> 7) + (load_3 * load_412) + (j15 * j16) + (j14 * j) + j37 + j38 + (j11 * j2) + (j10 * j3) + j39 + (load_35 * j5) + (j6 * j9) + (j7 * j8) + j40 + j79;
        long j102 = (load_418 + 1048576) >> 21;
        long j103 = (j14 * load_412) + (j13 * j16) + (j12 * j) + j44 + j45 + j46 + (load_35 * j3) + (j4 * j9) + (j5 * j8) + j47 + j81;
        long j104 = (j103 + 1048576) >> 21;
        long j105 = j104 << 21;
        long j106 = (j12 * load_412) + (j11 * j16) + (j10 * j) + j51 + j52 + (j2 * j9) + (j3 * j8) + j53 + j83;
        long j107 = (j106 + 1048576) >> 21;
        long j108 = j107 << 21;
        long j109 = (j10 * load_412) + j57 + (load_35 * j) + j58 + j59 + j60 + j85;
        long j110 = (j109 + 1048576) >> 21;
        long j111 = (load_35 * load_412) + (j9 * j16) + (j * j8) + j63 + j87;
        long j112 = (j111 + 1048576) >> 21;
        long j113 = (j8 * load_412) + j65 + j89;
        long j114 = (j113 + 1048576) >> 21;
        long j115 = (j86 - (j87 << 21)) + j110;
        long j116 = (j74 - j76) + j96 + (j115 * 666643);
        long j117 = (j116 + 1048576) >> 21;
        long j118 = j117 << 21;
        long j119 = j111 - (j112 << 21);
        long j120 = (j88 - (j89 << 21)) + j112;
        long j121 = (j77 - (j78 << 21)) + j98 + (j120 * 666643) + (j119 * 470296) + (j115 * 654183);
        long j122 = (j121 + 1048576) >> 21;
        long j123 = j122 << 21;
        long j124 = (j66 - (j90 << 21)) + j114;
        long j125 = j113 - (j114 << 21);
        long j126 = ((((((load_318 - (j79 << 21)) + j101) + (j124 * 666643)) + (j125 * 470296)) + (j120 * 654183)) - (j119 * 997805)) + (j115 * 136657);
        long j127 = (j126 + 1048576) >> 21;
        long j128 = ((((((j80 - (j81 << 21)) + j102) + (j90 * 470296)) + (j124 * 654183)) - (j125 * 997805)) + (j120 * 136657)) - (j119 * 683901);
        long j129 = (j128 + 1048576) >> 21;
        long j130 = ((((j82 - (j83 << 21)) + j104) - (j90 * 997805)) + (j124 * 136657)) - (j125 * 683901);
        long j131 = (j130 + 1048576) >> 21;
        long j132 = j131 << 21;
        long j133 = ((j84 - (j85 << 21)) + j107) - (j90 * 683901);
        long j134 = (j133 + 1048576) >> 21;
        long j135 = (j97 - j99) + (j119 * 666643) + (j115 * 470296) + j117;
        long j136 = (j135 + 1048576) >> 21;
        long j137 = (((((j100 - (j101 << 21)) + (j125 * 666643)) + (j120 * 470296)) + (j119 * 654183)) - (j115 * 997805)) + j122;
        long j138 = (j137 + 1048576) >> 21;
        long j139 = j138 << 21;
        long j140 = (((((((load_418 - (j102 << 21)) + (j90 * 666643)) + (j124 * 470296)) + (j125 * 654183)) - (j120 * 997805)) + (j119 * 136657)) - (j115 * 683901)) + j127;
        long j141 = (j140 + 1048576) >> 21;
        long j142 = j141 << 21;
        long j143 = (((((j103 - j105) + (j90 * 654183)) - (j124 * 997805)) + (j125 * 136657)) - (j120 * 683901)) + j129;
        long j144 = (j143 + 1048576) >> 21;
        long j145 = (((j106 - j108) + (j90 * 136657)) - (j124 * 683901)) + j131;
        long j146 = (j145 + 1048576) >> 21;
        long j147 = (j128 - (j129 << 21)) + j141;
        long j148 = (j67 - (j68 << 21)) + (j147 * 666643);
        long j149 = (j148 + 1048576) >> 21;
        long j150 = j149 << 21;
        long j151 = (j130 - j132) + j144;
        long j152 = j143 - (j144 << 21);
        long j153 = (j69 - j71) + j92 + (j151 * 666643) + (j152 * 470296) + (j147 * 654183);
        long j154 = (j153 + 1048576) >> 21;
        long j155 = j154 << 21;
        long j156 = (j133 - (j134 << 21)) + j146;
        long j157 = j145 - (j146 << 21);
        long j158 = ((((((j72 - (j73 << 21)) + j94) + (j156 * 666643)) + (j157 * 470296)) + (j151 * 654183)) - (j152 * 997805)) + (j147 * 136657);
        long j159 = (j158 + 1048576) >> 21;
        long j160 = (j109 - (j110 << 21)) + j134;
        long j161 = (((((j116 - j118) + (j160 * 470296)) + (j156 * 654183)) - (j157 * 997805)) + (j151 * 136657)) - (j152 * 683901);
        long j162 = (j161 + 1048576) >> 21;
        long j163 = ((((j121 - j123) + j136) - (j160 * 997805)) + (j156 * 136657)) - (j157 * 683901);
        long j164 = (j163 + 1048576) >> 21;
        long j165 = ((j126 - (j127 << 21)) + j138) - (j160 * 683901);
        long j166 = (j165 + 1048576) >> 21;
        long j167 = j166 << 21;
        long j168 = (j91 - (j92 << 21)) + (j152 * 666643) + (j147 * 470296) + j149;
        long j169 = (j168 + 1048576) >> 21;
        long j170 = (((((j93 - (j94 << 21)) + (j157 * 666643)) + (j151 * 470296)) + (j152 * 654183)) - (j147 * 997805)) + j154;
        long j171 = (j170 + 1048576) >> 21;
        long j172 = (((((((j95 - (j96 << 21)) + (j160 * 666643)) + (j156 * 470296)) + (j157 * 654183)) - (j151 * 997805)) + (j152 * 136657)) - (j147 * 683901)) + j159;
        long j173 = (j172 + 1048576) >> 21;
        long j174 = (((((j135 - (j136 << 21)) + (j160 * 654183)) - (j156 * 997805)) + (j157 * 136657)) - (j151 * 683901)) + j162;
        long j175 = (j174 + 1048576) >> 21;
        long j176 = (((j137 - j139) + (j160 * 136657)) - (j156 * 683901)) + j164;
        long j177 = (j176 + 1048576) >> 21;
        long j178 = (j140 - j142) + j166;
        long j179 = (j178 + 1048576) >> 21;
        long j180 = j179 << 21;
        long j181 = (j148 - j150) + (j179 * 666643);
        long j182 = j181 >> 21;
        long j183 = j182 << 21;
        long j184 = (j168 - (j169 << 21)) + (j179 * 470296) + j182;
        long j185 = j184 >> 21;
        long j186 = j185 << 21;
        long j187 = (j153 - j155) + j169 + (j179 * 654183) + j185;
        long j188 = j187 >> 21;
        long j189 = j188 << 21;
        long j190 = ((j170 - (j171 << 21)) - (j179 * 997805)) + j188;
        long j191 = j190 >> 21;
        long j192 = j191 << 21;
        long j193 = (j158 - (j159 << 21)) + j171 + (j179 * 136657) + j191;
        long j194 = j193 >> 21;
        long j195 = j194 << 21;
        long j196 = ((j172 - (j173 << 21)) - (j179 * 683901)) + j194;
        long j197 = j196 >> 21;
        long j198 = j197 << 21;
        long j199 = (j161 - (j162 << 21)) + j173 + j197;
        long j200 = j199 >> 21;
        long j201 = j200 << 21;
        long j202 = (j174 - (j175 << 21)) + j200;
        long j203 = j202 >> 21;
        long j204 = j203 << 21;
        long j205 = (j163 - (j164 << 21)) + j175 + j203;
        long j206 = j205 >> 21;
        long j207 = j206 << 21;
        long j208 = (j176 - (j177 << 21)) + j206;
        long j209 = j208 >> 21;
        long j210 = j209 << 21;
        long j211 = (j165 - j167) + j177 + j209;
        long j212 = j211 >> 21;
        long j213 = j212 << 21;
        long j214 = (j178 - j180) + j212;
        long j215 = j214 >> 21;
        long j216 = j215 << 21;
        long j217 = (j181 - j183) + (666643 * j215);
        long j218 = j217 >> 21;
        long j219 = j218 << 21;
        long j220 = (j184 - j186) + (470296 * j215) + j218;
        long j221 = j220 >> 21;
        long j222 = j221 << 21;
        long j223 = (j187 - j189) + (654183 * j215) + j221;
        long j224 = j223 >> 21;
        long j225 = j224 << 21;
        long j226 = ((j190 - j192) - (997805 * j215)) + j224;
        long j227 = j226 >> 21;
        long j228 = j227 << 21;
        long j229 = (j193 - j195) + (136657 * j215) + j227;
        long j230 = j229 >> 21;
        long j231 = j230 << 21;
        long j232 = ((j196 - j198) - (j215 * 683901)) + j230;
        long j233 = j232 >> 21;
        long j234 = j233 << 21;
        long j235 = (j199 - j201) + j233;
        long j236 = j235 >> 21;
        long j237 = j236 << 21;
        long j238 = (j202 - j204) + j236;
        long j239 = j238 >> 21;
        long j240 = j239 << 21;
        long j241 = (j205 - j207) + j239;
        long j242 = j241 >> 21;
        long j243 = j242 << 21;
        long j244 = (j208 - j210) + j242;
        long j245 = j244 >> 21;
        long j246 = j245 << 21;
        long j247 = (j211 - j213) + j245;
        long j248 = j247 >> 21;
        bArr[0] = (byte) (j217 - j219);
        long j249 = j238 - j240;
        long j250 = j235 - j237;
        long j251 = j232 - j234;
        long j252 = j229 - j231;
        long j253 = j226 - j228;
        long j254 = j223 - j225;
        long j255 = j220 - j222;
        bArr[1] = (byte) (r3 >> 8);
        bArr[2] = (byte) ((r3 >> 16) | (j255 << 5));
        bArr[3] = (byte) (j255 >> 3);
        bArr[4] = (byte) (j255 >> 11);
        bArr[5] = (byte) ((j255 >> 19) | (j254 << 2));
        bArr[6] = (byte) (j254 >> 6);
        bArr[7] = (byte) ((j254 >> 14) | (j253 << 7));
        bArr[8] = (byte) (j253 >> 1);
        bArr[9] = (byte) (j253 >> 9);
        bArr[10] = (byte) ((j253 >> 17) | (j252 << 4));
        bArr[11] = (byte) (j252 >> 4);
        bArr[12] = (byte) (j252 >> 12);
        bArr[13] = (byte) ((j252 >> 20) | (j251 + j251));
        bArr[14] = (byte) (j251 >> 7);
        bArr[15] = (byte) ((j251 >> 15) | (j250 << 6));
        bArr[16] = (byte) (j250 >> 2);
        bArr[17] = (byte) (j250 >> 10);
        bArr[18] = (byte) ((j250 >> 18) | (j249 << 3));
        long j256 = j247 - (j248 << 21);
        long j257 = (j214 - j216) + j248;
        long j258 = j244 - j246;
        bArr[19] = (byte) (j249 >> 5);
        bArr[20] = (byte) (j249 >> 13);
        bArr[21] = (byte) (j241 - j243);
        bArr[22] = (byte) (r0 >> 8);
        bArr[23] = (byte) ((r0 >> 16) | (j258 << 5));
        bArr[24] = (byte) (j258 >> 3);
        bArr[25] = (byte) (j258 >> 11);
        bArr[26] = (byte) ((j258 >> 19) | (j256 << 2));
        bArr[27] = (byte) (j256 >> 6);
        bArr[28] = (byte) ((j256 >> 14) | (j257 << 7));
        bArr[29] = (byte) (j257 >> 1);
        bArr[30] = (byte) (j257 >> 9);
        bArr[31] = (byte) (j257 >> 17);
    }
}
