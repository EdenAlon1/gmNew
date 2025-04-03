package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eraq implements eygg {
    static final eygg a = new eraq();

    private eraq() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        erar erarVar;
        switch (i) {
            case 0:
                erarVar = erar.UNKNOWN;
                break;
            case 1:
                erarVar = erar.BUCKET_ZERO;
                break;
            case 2:
                erarVar = erar.BUCKET_1_TO_2;
                break;
            case 3:
                erarVar = erar.BUCKET_2_TO_4;
                break;
            case 4:
                erarVar = erar.BUCKET_4_TO_8;
                break;
            case 5:
                erarVar = erar.BUCKET_8_TO_16;
                break;
            case 6:
                erarVar = erar.BUCKET_16_TO_32;
                break;
            case 7:
                erarVar = erar.BUCKET_32_TO_64;
                break;
            case 8:
                erarVar = erar.BUCKET_64_TO_128;
                break;
            case 9:
                erarVar = erar.BUCKET_128_TO_256;
                break;
            case 10:
                erarVar = erar.BUCKET_256_TO_512;
                break;
            case 11:
                erarVar = erar.BUCKET_512_TO_1024;
                break;
            case 12:
                erarVar = erar.BUCKET_1024_OR_MORE;
                break;
            default:
                erarVar = null;
                break;
        }
        return erarVar != null;
    }
}
