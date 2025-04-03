package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envk extends envh {
    public static final envh a = new envk();

    private envk() {
    }

    @Override // defpackage.envh
    public final ento a(String str) {
        return new envm(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
