package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffuw extends ffgo implements ffud {
    public static final ffuw a = new ffuw();

    private ffuw() {
        super(ffud.c);
    }

    @Override // defpackage.ffud
    @ffbs
    public final ffte hZ(ffji ffjiVar) {
        return ffux.a;
    }

    @Override // defpackage.ffud
    @ffbs
    public final Object o(ffgu ffguVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.ffud
    @ffbs
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.ffud
    @ffbs
    public final ffrm q(ffro ffroVar) {
        return ffux.a;
    }

    @Override // defpackage.ffud
    @ffbs
    public final ffte s(boolean z, boolean z2, ffji ffjiVar) {
        return ffux.a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.ffud
    public final boolean v() {
        return true;
    }

    @Override // defpackage.ffud
    public final boolean x() {
        return false;
    }

    @Override // defpackage.ffud
    public final boolean y() {
        return false;
    }

    @Override // defpackage.ffud
    @ffbs
    public final boolean z() {
        return false;
    }

    @Override // defpackage.ffud
    @ffbs
    public final void t(CancellationException cancellationException) {
    }
}
