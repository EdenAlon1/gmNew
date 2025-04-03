package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfp extends esfh {
    public evrz a;

    public esfp(evrz evrzVar) {
        this.a = evrzVar;
    }

    @Override // defpackage.esfh
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.esfh
    public final long b() {
        return this.a.d;
    }

    @Override // defpackage.esfh
    public final void c(long j) {
        evrw evrwVar = (evrw) evrz.a.createBuilder(this.a);
        evrwVar.copyOnWrite();
        evrz evrzVar = (evrz) evrwVar.instance;
        evrzVar.b |= 2;
        evrzVar.d = j;
        this.a = (evrz) evrwVar.build();
    }

    @Override // defpackage.esfh
    public final boolean d() {
        return (this.a.b & 1) != 0;
    }

    @Override // defpackage.esfh
    public final boolean e() {
        return (this.a.b & 64) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.esfh
    public final int f() {
        char c;
        int a = evry.a(this.a.i);
        if (a == 0) {
            a = 1;
        }
        String str = a != 1 ? a != 2 ? a != 6 ? a != 11 ? a != 21 ? "null" : "FROM_DEFAULT_COUNTRY" : "FROM_NUMBER_WITHOUT_PLUS_SIGN" : "FROM_NUMBER_WITH_IDD" : "FROM_NUMBER_WITH_PLUS_SIGN" : "UNSPECIFIED";
        switch (str.hashCode()) {
            case -1655163414:
                if (str.equals("FROM_NUMBER_WITH_PLUS_SIGN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -702235158:
                if (str.equals("FROM_NUMBER_WITHOUT_PLUS_SIGN")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 526786327:
                if (str.equals("UNSPECIFIED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1308390705:
                if (str.equals("FROM_NUMBER_WITH_IDD")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1337199811:
                if (str.equals("FROM_DEFAULT_COUNTRY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 1;
        }
        if (c == 1) {
            return 2;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 4;
        }
        if (c == 4) {
            return 5;
        }
        throw new IllegalArgumentException();
    }
}
