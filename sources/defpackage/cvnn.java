package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvnn extends ffhv implements ffjm {
    final /* synthetic */ cvno a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvnn(cvno cvnoVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cvnoVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvnn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cvno cvnoVar = this.a;
        cvni cvniVar = null;
        if (cvnoVar.g.e) {
            efbd.b();
            ConversationIdType conversationIdType = new ConversationIdType(cvnoVar.g.c);
            cvniVar = new cvni(((bdrr) cvnoVar.c.b()).b(cvnoVar.g.d), conversationIdType.b() ? null : ((bczy) cvnoVar.d.b()).s(conversationIdType));
        }
        boolean z = this.b;
        ((akzt) this.a.f.b()).e("Bugle.Spam.UrlClick.Counts", (z && cvnp.b(cvniVar)) ? 2 : (z && cvnp.a(cvniVar)) ? 3 : z ? 1 : cvnp.b(cvniVar) ? 5 : cvnp.a(cvniVar) ? 6 : 4);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvnn(this.a, this.b, ffguVar);
    }
}
