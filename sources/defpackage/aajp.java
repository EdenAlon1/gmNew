package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajp extends fflr {
    final /* synthetic */ aajq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajp(aajq aajqVar) {
        super(null);
        this.a = aajqVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        if (ffkj.e((MessageId) obj, (MessageId) obj2)) {
            return;
        }
        aaja aajaVar = (aaja) this.a.e.b();
        axol.k(aajaVar.a, null, new aais(aajaVar, null), 3);
    }
}
