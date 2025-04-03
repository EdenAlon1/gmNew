package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nku extends nky {
    private final luv a = new luv();
    private final luu d = new luu();
    private int e = -1;
    private final int f;
    private final nks[] g;
    private nks h;
    private List i;
    private List j;
    private nkt k;
    private int l;

    public nku(int i, List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = lto.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new nks[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.g[i2] = new nks();
        }
        this.h = this.g[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List k() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nku.k():java.util.List");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0133. Please report as an issue. */
    private final void l() {
        int i;
        char c;
        boolean z;
        nkt nktVar = this.k;
        if (nktVar != null) {
            int i2 = nktVar.b;
            int i3 = nktVar.d;
            int i4 = (i2 + i2) - 1;
            if (i3 != i4) {
                luj.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + i4 + ", but current index is " + i3 + " (sequence number " + nktVar.a + ");");
            }
            luu luuVar = this.d;
            nkt nktVar2 = this.k;
            luuVar.k(nktVar2.c, nktVar2.d);
            boolean z2 = false;
            while (true) {
                if (this.d.a() > 0) {
                    luu luuVar2 = this.d;
                    int i5 = 3;
                    int d = luuVar2.d(3);
                    int d2 = luuVar2.d(5);
                    int i6 = 7;
                    if (d == 7) {
                        this.d.n(2);
                        d = this.d.d(6);
                        if (d < 7) {
                            luj.f("Cea708Decoder", a.h(d, "Invalid extended service number: "));
                        }
                    }
                    if (d2 == 0) {
                        if (d != 0) {
                            luj.f("Cea708Decoder", a.f(d, "serviceNumber is non-zero (", ") when blockSize is 0"));
                        }
                    } else if (d != this.f) {
                        this.d.o(d2);
                    } else {
                        int c2 = this.d.c() + (d2 * 8);
                        while (this.d.c() < c2) {
                            int d3 = this.d.d(8);
                            if (d3 == 16) {
                                int d4 = this.d.d(8);
                                if (d4 <= 31) {
                                    i = 7;
                                    if (d4 > 7) {
                                        if (d4 <= 15) {
                                            this.d.n(8);
                                        } else if (d4 <= 23) {
                                            this.d.n(16);
                                        } else {
                                            this.d.n(24);
                                        }
                                    }
                                } else {
                                    i = 7;
                                    if (d4 <= 127) {
                                        if (d4 == 32) {
                                            this.h.c(' ');
                                        } else if (d4 == 33) {
                                            this.h.c((char) 160);
                                        } else if (d4 == 37) {
                                            this.h.c((char) 8230);
                                        } else if (d4 == 42) {
                                            this.h.c((char) 352);
                                        } else if (d4 == 44) {
                                            this.h.c((char) 338);
                                        } else if (d4 == 63) {
                                            this.h.c((char) 376);
                                        } else if (d4 == 57) {
                                            this.h.c((char) 8482);
                                        } else if (d4 == 58) {
                                            this.h.c((char) 353);
                                        } else if (d4 == 60) {
                                            this.h.c((char) 339);
                                        } else if (d4 != 61) {
                                            switch (d4) {
                                                case 48:
                                                    this.h.c((char) 9608);
                                                    break;
                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                    this.h.c((char) 8216);
                                                    break;
                                                case 50:
                                                    this.h.c((char) 8217);
                                                    break;
                                                case 51:
                                                    this.h.c((char) 8220);
                                                    break;
                                                case 52:
                                                    this.h.c((char) 8221);
                                                    break;
                                                case 53:
                                                    this.h.c((char) 8226);
                                                    break;
                                                default:
                                                    switch (d4) {
                                                        case 118:
                                                            this.h.c((char) 8539);
                                                            break;
                                                        case 119:
                                                            this.h.c((char) 8540);
                                                            break;
                                                        case 120:
                                                            this.h.c((char) 8541);
                                                            break;
                                                        case 121:
                                                            this.h.c((char) 8542);
                                                            break;
                                                        case 122:
                                                            this.h.c((char) 9474);
                                                            break;
                                                        case 123:
                                                            this.h.c((char) 9488);
                                                            break;
                                                        case 124:
                                                            this.h.c((char) 9492);
                                                            break;
                                                        case 125:
                                                            this.h.c((char) 9472);
                                                            break;
                                                        case 126:
                                                            this.h.c((char) 9496);
                                                            break;
                                                        case 127:
                                                            this.h.c((char) 9484);
                                                            break;
                                                        default:
                                                            luj.f("Cea708Decoder", a.h(d4, "Invalid G2 character: "));
                                                            break;
                                                    }
                                            }
                                        } else {
                                            this.h.c((char) 8480);
                                        }
                                        z2 = true;
                                        i6 = 7;
                                    } else {
                                        if (d4 > 159) {
                                            c = 6;
                                            if (d4 <= 255) {
                                                if (d4 == 160) {
                                                    this.h.c((char) 13252);
                                                } else {
                                                    luj.f("Cea708Decoder", a.h(d4, "Invalid G3 character: "));
                                                    this.h.c('_');
                                                }
                                                z2 = true;
                                            } else {
                                                luj.f("Cea708Decoder", a.h(d4, "Invalid extended command: "));
                                            }
                                        } else if (d4 <= 135) {
                                            this.d.n(32);
                                        } else if (d4 <= 143) {
                                            this.d.n(40);
                                        } else {
                                            this.d.n(2);
                                            c = 6;
                                            this.d.n(this.d.d(6) * 8);
                                        }
                                        i6 = i;
                                    }
                                }
                                c = 6;
                                i6 = i;
                            } else if (d3 <= 31) {
                                if (d3 != 0) {
                                    if (d3 == i5) {
                                        this.i = k();
                                    } else if (d3 != 8) {
                                        switch (d3) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.h.c('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (d3 < 17 || d3 > 23) {
                                                    if (d3 >= 24) {
                                                        luj.f("Cea708Decoder", a.h(d3, "Currently unsupported COMMAND_P16 Command: "));
                                                        this.d.n(16);
                                                        break;
                                                    } else {
                                                        luj.f("Cea708Decoder", a.h(d3, "Invalid C0 command: "));
                                                        break;
                                                    }
                                                } else {
                                                    luj.f("Cea708Decoder", a.h(d3, "Currently unsupported COMMAND_EXT1 Command: "));
                                                    this.d.n(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        nks nksVar = this.h;
                                        int length = nksVar.l.length();
                                        if (length > 0) {
                                            nksVar.l.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i6;
                                c = 6;
                                i6 = i;
                            } else {
                                if (d3 > 127) {
                                    if (d3 <= 159) {
                                        switch (d3) {
                                            case 128:
                                            case 129:
                                            case 130:
                                            case 131:
                                            case 132:
                                            case 133:
                                            case 134:
                                            case 135:
                                                z = true;
                                                int i7 = d3 - 128;
                                                if (this.l != i7) {
                                                    this.l = i7;
                                                    this.h = this.g[i7];
                                                    break;
                                                }
                                                break;
                                            case 136:
                                                z = true;
                                                for (int i8 = 1; i8 <= 8; i8++) {
                                                    if (this.d.p()) {
                                                        this.g[8 - i8].d();
                                                    }
                                                }
                                                break;
                                            case 137:
                                                for (int i9 = 1; i9 <= 8; i9++) {
                                                    if (this.d.p()) {
                                                        this.g[8 - i9].n = true;
                                                    }
                                                }
                                                z = true;
                                                break;
                                            case 138:
                                                for (int i10 = 1; i10 <= 8; i10++) {
                                                    if (this.d.p()) {
                                                        this.g[8 - i10].n = false;
                                                    }
                                                }
                                                z2 = true;
                                                i6 = 7;
                                                break;
                                            case 139:
                                                for (int i11 = 1; i11 <= 8; i11++) {
                                                    if (this.d.p()) {
                                                        this.g[8 - i11].n = !r2.n;
                                                    }
                                                }
                                                z2 = true;
                                                i6 = 7;
                                                break;
                                            case 140:
                                                for (int i12 = 1; i12 <= 8; i12++) {
                                                    if (this.d.p()) {
                                                        this.g[8 - i12].e();
                                                    }
                                                }
                                                z2 = true;
                                                i6 = 7;
                                                break;
                                            case 141:
                                                this.d.n(8);
                                                z2 = true;
                                                i6 = 7;
                                                break;
                                            case 142:
                                                break;
                                            case 143:
                                                m();
                                                z2 = true;
                                                i6 = 7;
                                                break;
                                            case 144:
                                                if (!this.h.m) {
                                                    this.d.n(16);
                                                    z2 = true;
                                                    i5 = 3;
                                                    i6 = 7;
                                                    break;
                                                } else {
                                                    luu luuVar3 = this.d;
                                                    luuVar3.d(4);
                                                    luuVar3.d(2);
                                                    luuVar3.d(2);
                                                    boolean p = luuVar3.p();
                                                    boolean p2 = luuVar3.p();
                                                    i5 = 3;
                                                    luuVar3.d(3);
                                                    luuVar3.d(3);
                                                    this.h.g(p, p2);
                                                    z2 = true;
                                                    i6 = 7;
                                                }
                                            case 145:
                                                if (this.h.m) {
                                                    luu luuVar4 = this.d;
                                                    int a = nks.a(luuVar4.d(2), luuVar4.d(2), luuVar4.d(2), luuVar4.d(2));
                                                    luu luuVar5 = this.d;
                                                    int a2 = nks.a(luuVar5.d(2), luuVar5.d(2), luuVar5.d(2), luuVar5.d(2));
                                                    this.d.n(2);
                                                    luu luuVar6 = this.d;
                                                    nks.j(luuVar6.d(2), luuVar6.d(2), luuVar6.d(2));
                                                    this.h.h(a, a2);
                                                } else {
                                                    this.d.n(24);
                                                }
                                                z2 = true;
                                                i5 = 3;
                                                i6 = 7;
                                                break;
                                            case 146:
                                                if (this.h.m) {
                                                    this.d.n(4);
                                                    luu luuVar7 = this.d;
                                                    int d5 = luuVar7.d(4);
                                                    luuVar7.n(2);
                                                    this.d.d(6);
                                                    nks nksVar2 = this.h;
                                                    if (nksVar2.y != d5) {
                                                        nksVar2.c('\n');
                                                    }
                                                    nksVar2.y = d5;
                                                } else {
                                                    this.d.n(16);
                                                }
                                                z2 = true;
                                                i5 = 3;
                                                i6 = 7;
                                                break;
                                            case 147:
                                            case 148:
                                            case 149:
                                            case 150:
                                            default:
                                                z = true;
                                                luj.f("Cea708Decoder", a.h(d3, "Invalid C1 command: "));
                                                break;
                                            case 151:
                                                if (this.h.m) {
                                                    luu luuVar8 = this.d;
                                                    int a3 = nks.a(luuVar8.d(2), luuVar8.d(2), luuVar8.d(2), luuVar8.d(2));
                                                    luu luuVar9 = this.d;
                                                    luuVar9.d(2);
                                                    nks.j(luuVar9.d(2), luuVar9.d(2), luuVar9.d(2));
                                                    this.d.p();
                                                    luu luuVar10 = this.d;
                                                    luuVar10.p();
                                                    luuVar10.d(2);
                                                    this.d.d(2);
                                                    int d6 = this.d.d(2);
                                                    this.d.n(8);
                                                    this.h.i(a3, d6);
                                                } else {
                                                    this.d.n(32);
                                                }
                                                z2 = true;
                                                i5 = 3;
                                                i6 = 7;
                                                break;
                                            case 152:
                                            case 153:
                                            case 154:
                                            case 155:
                                            case 156:
                                            case 157:
                                            case 158:
                                            case 159:
                                                int i13 = d3 - 152;
                                                nks[] nksVarArr = this.g;
                                                luu luuVar11 = this.d;
                                                nks nksVar3 = nksVarArr[i13];
                                                luuVar11.n(2);
                                                luu luuVar12 = this.d;
                                                boolean p3 = luuVar12.p();
                                                luuVar12.n(2);
                                                luu luuVar13 = this.d;
                                                int d7 = luuVar13.d(i5);
                                                boolean p4 = luuVar13.p();
                                                int d8 = luuVar13.d(i6);
                                                int d9 = luuVar13.d(8);
                                                int d10 = luuVar13.d(4);
                                                int d11 = luuVar13.d(4);
                                                luuVar13.n(2);
                                                this.d.n(6);
                                                this.d.n(2);
                                                luu luuVar14 = this.d;
                                                int d12 = luuVar14.d(i5);
                                                int d13 = luuVar14.d(i5);
                                                nksVar3.m = true;
                                                nksVar3.n = p3;
                                                nksVar3.o = d7;
                                                nksVar3.p = p4;
                                                nksVar3.q = d8;
                                                nksVar3.r = d9;
                                                nksVar3.s = d10;
                                                int i14 = d11 + 1;
                                                if (nksVar3.t != i14) {
                                                    nksVar3.t = i14;
                                                    while (true) {
                                                        if (nksVar3.k.size() >= nksVar3.t || nksVar3.k.size() >= 15) {
                                                            nksVar3.k.remove(0);
                                                        }
                                                    }
                                                }
                                                if (d12 != 0 && nksVar3.v != d12) {
                                                    nksVar3.v = d12;
                                                    int i15 = d12 - 1;
                                                    int i16 = nks.g[i15];
                                                    boolean z3 = nks.f[i15];
                                                    int i17 = nks.d[i15];
                                                    int i18 = nks.e[i15];
                                                    nksVar3.i(i16, nks.c[i15]);
                                                }
                                                if (d13 != 0 && nksVar3.w != d13) {
                                                    nksVar3.w = d13;
                                                    int i19 = d13 - 1;
                                                    int i20 = nks.i[i19];
                                                    int i21 = nks.h[i19];
                                                    nksVar3.g(false, false);
                                                    nksVar3.h(nks.a, nks.j[i19]);
                                                }
                                                if (this.l != i13) {
                                                    this.l = i13;
                                                    this.h = this.g[i13];
                                                }
                                                z2 = true;
                                                i5 = 3;
                                                i6 = 7;
                                                break;
                                        }
                                    } else {
                                        z = true;
                                        if (d3 <= 255) {
                                            this.h.c((char) (d3 & PrivateKeyType.INVALID));
                                        } else {
                                            luj.f("Cea708Decoder", a.h(d3, "Invalid base command: "));
                                            c = 6;
                                            i = 7;
                                            i6 = i;
                                        }
                                    }
                                    z2 = z;
                                    i6 = 7;
                                } else if (d3 == 127) {
                                    this.h.c((char) 9835);
                                } else {
                                    this.h.c((char) (d3 & PrivateKeyType.INVALID));
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            if (z2) {
                this.i = k();
            }
            this.k = null;
        }
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.nky, defpackage.lxw
    public final void c() {
        super.c();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        m();
        this.k = null;
    }

    @Override // defpackage.nky
    protected final njw g() {
        List list = this.i;
        this.j = list;
        lti.f(list);
        return new nkz(list);
    }

    @Override // defpackage.nky
    protected final void i(nkc nkcVar) {
        nkt nktVar;
        ByteBuffer byteBuffer = nkcVar.d;
        lti.f(byteBuffer);
        this.a.I(byteBuffer.array(), byteBuffer.limit());
        while (this.a.b() >= 3) {
            int j = this.a.j();
            int i = j & 3;
            byte j2 = (byte) this.a.j();
            byte j3 = (byte) this.a.j();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((j & 4) == 4) {
                if (i == 3) {
                    l();
                    int i2 = this.e;
                    int i3 = (j2 & 192) >> 6;
                    if (i2 != -1 && i3 != (3 & (i2 + 1))) {
                        m();
                        luj.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.e + " current=" + i3);
                    }
                    this.e = i3;
                    int i4 = j2 & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    nktVar = new nkt(i3, i4);
                    this.k = nktVar;
                    byte[] bArr = nktVar.c;
                    int i5 = nktVar.d;
                    nktVar.d = i5 + 1;
                    bArr[i5] = j3;
                } else {
                    lti.a(true);
                    nktVar = this.k;
                    if (nktVar == null) {
                        luj.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = nktVar.d;
                        int i7 = i6 + 1;
                        nktVar.d = i7;
                        byte[] bArr2 = nktVar.c;
                        bArr2[i6] = j2;
                        nktVar.d = i6 + 2;
                        bArr2[i7] = j3;
                    }
                }
                int i8 = nktVar.d;
                int i9 = nktVar.b;
                if (i8 == (i9 + i9) - 1) {
                    l();
                }
            }
        }
    }

    @Override // defpackage.nky
    protected final boolean j() {
        return this.i != this.j;
    }

    @Override // defpackage.nky, defpackage.lxw
    public final /* bridge */ /* synthetic */ void e() {
    }
}
