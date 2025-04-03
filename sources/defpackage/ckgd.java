package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ckgd {
    public static ckgd e(eqwf eqwfVar, ckgb ckgbVar, int i, Optional optional) {
        Optional of = Optional.of(Integer.valueOf(i));
        if (eqwfVar == null) {
            eqwfVar = eqwf.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
        }
        return new ckez(eqwfVar, ckgbVar, of, optional);
    }

    public abstract ckgb a();

    public abstract eqwf b();

    public abstract Optional c();

    public abstract Optional d();
}
