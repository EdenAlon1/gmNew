package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wsd extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ wsf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsd(wsf wsfVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = wsfVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        wsd wsdVar = new wsd(this.f, (ffgu) obj6);
        wsdVar.a = (engw) obj;
        wsdVar.b = (alxj) obj2;
        wsdVar.c = (Recipient) obj3;
        wsdVar.d = (cnpk) obj4;
        wsdVar.e = (aqvj) obj5;
        return wsdVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r9 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        boolean z = r1 != 0 && r1.g().r();
        boolean z2 = !((atti) this.f.c.b()).a() ? ((cnpk) obj2).b() : ((aqvj) obj3).a();
        if (z) {
            wsf wsfVar = this.f;
            r1.getClass();
            engw r = engw.r((ResolvedRecipient) r1);
            r.getClass();
            return wsfVar.c(r, false, z2);
        }
        if (r0.b() != alxi.ONE_ON_ONE || r9.isEmpty()) {
            return null;
        }
        engw engwVar = (engw) r9;
        if (((ResolvedRecipient) engwVar.get(0)).g().r()) {
            return this.f.c(engwVar, true, z2);
        }
        return null;
    }
}
