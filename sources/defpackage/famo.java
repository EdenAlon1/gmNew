package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class famo implements eygg {
    static final eygg a = new famo();

    private famo() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        if (i == 100 || i == 101 || i == 200 || i == 201 || i == 400 || i == 401 || i == 500 || i == 600 || i == 700 || i == 2000 || i == 800 || i == 801) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                switch (i) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        return true;
                    default:
                        switch (i) {
                            case 312:
                            case 313:
                            case 314:
                            case 315:
                            case 316:
                            case 317:
                            case 318:
                            case 319:
                            case 320:
                            case 321:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }
}
