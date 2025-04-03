package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dege extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ degf e;
    final /* synthetic */ defr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dege(degf degfVar, defr defrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = degfVar;
        this.f = defrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dege) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        ffhh ffhhVar = ffhh.a;
        int i = this.d;
        try {
            if (i == 0) {
                ffci.b(obj);
                obj2 = (dhzv) this.e.b.b();
                String str = this.f.c;
                obj3 = "/bugle/rpc/proto/v1/list_conversations/";
                defs defsVar = (defs) this.e.c.b();
                cvia cviaVar = this.f.d;
                if (cviaVar == null) {
                    cviaVar = cvia.a;
                }
                cviaVar.getClass();
                this.a = obj2;
                this.b = str;
                this.c = "/bugle/rpc/proto/v1/list_conversations/";
                this.d = 1;
                Object b = defsVar.b(cviaVar, this);
                if (b != ffhhVar) {
                    obj4 = str;
                    obj = b;
                }
                return ffhhVar;
            }
            if (i != 1) {
                ffci.b(obj);
                ensz enszVar = (ensz) degf.a.h();
                enszVar.Y(csux.O, "LoadPagedConversationTimeoutFallbackHandler");
                enszVar.q("Sent paged conversation data to message client");
                return ceyt.i();
            }
            obj3 = this.c;
            obj4 = this.b;
            obj2 = this.a;
            ffci.b(obj);
            ListenableFuture a = duin.a(((dhzv) obj2).a((String) obj4, (String) obj3, ((cvhx) obj).toByteArray()));
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 2;
            if (fgfz.c(a, this) == ffhhVar) {
                return ffhhVar;
            }
            ensz enszVar2 = (ensz) degf.a.h();
            enszVar2.Y(csux.O, "LoadPagedConversationTimeoutFallbackHandler");
            enszVar2.q("Sent paged conversation data to message client");
            return ceyt.i();
        } catch (Exception unused) {
            ensz enszVar3 = (ensz) degf.a.j();
            enszVar3.Y(csux.O, "LoadPagedConversationTimeoutFallbackHandler");
            enszVar3.q("Failed to send paged conversation data to data client");
            ((akzt) ((defd) this.e.d.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.TimeoutFallback.Error");
            return ceyt.k();
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dege(this.e, this.f, ffguVar);
    }
}
