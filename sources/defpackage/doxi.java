package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxi {
    public static /* synthetic */ int a(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        if ((context.getResources().getConfiguration().uiMode & 48) != 32) {
            return b(i);
        }
        switch (b(i)) {
            case -16749196:
                return -11677471;
            case -15502541:
                return -8271467;
            case -15181124:
                return -7686920;
            case -9033797:
                return -3831047;
            case -6728704:
                return -217744;
            case -4716942:
                return -29749;
            default:
                return i;
        }
    }

    private static final int b(int i) {
        switch (i) {
            case -16746133:
                return -16749196;
            case -15108398:
                return -15181124;
            case -13615201:
                return -15502541;
            case -8708190:
                return -9033797;
            case -4056997:
                return -4716942;
            case -2937041:
                return -6728704;
            default:
                return i;
        }
    }
}
