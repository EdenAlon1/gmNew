package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feue extends feuc {
    @Override // defpackage.feuc
    public final boolean a(feuf feufVar) {
        synchronized (feufVar) {
            if (feufVar.a != 0) {
                return false;
            }
            feufVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.feuc
    public final void b(feuf feufVar) {
        synchronized (feufVar) {
            feufVar.a = 0;
        }
    }
}
