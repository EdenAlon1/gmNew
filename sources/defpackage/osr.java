package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osr extends otp {
    private final Callable j;

    public osr(otb otbVar, orx orxVar, String[] strArr, Callable callable) {
        super(otbVar, orxVar, strArr);
        this.j = callable;
    }

    @Override // defpackage.otp
    public final Object b() {
        return ((pyv) this.j).call();
    }
}
