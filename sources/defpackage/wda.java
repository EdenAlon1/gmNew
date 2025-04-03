package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wda implements wcv {
    public final ckzm a;
    private final errl b;
    private final ffbr c;
    private final ffbr d;

    public wda(ckzm ckzmVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ckzmVar;
        this.b = errlVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.wcv
    public final void a(final ConversationIdType conversationIdType, aqkv aqkvVar) {
        cknc ckncVar = (cknc) this.c.b();
        axad a = ckncVar.a();
        cknc.r(ckncVar, 18, 0, null, a, null, null, 54);
        final ckzk ckzkVar = (ckzk) ckzl.a.createBuilder();
        ckzkVar.copyOnWrite();
        ckzl ckzlVar = (ckzl) ckzkVar.instance;
        ckzlVar.f = a;
        ckzlVar.b |= 2;
        String a2 = conversationIdType.a();
        ckzkVar.copyOnWrite();
        ckzl ckzlVar2 = (ckzl) ckzkVar.instance;
        a2.getClass();
        ckzlVar2.c = a2;
        ckzkVar.copyOnWrite();
        ckzl ckzlVar3 = (ckzl) ckzkVar.instance;
        String str = aqkvVar.a;
        str.getClass();
        ckzlVar3.e = str;
        ((ckac) this.d.b()).f(conversationIdType).h(new emwl() { // from class: wcz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ckzk ckzkVar2 = ckzk.this;
                awui awuiVar = (awui) obj;
                ckzkVar2.copyOnWrite();
                ckzl ckzlVar4 = (ckzl) ckzkVar2.instance;
                ckzl ckzlVar5 = ckzl.a;
                awuiVar.getClass();
                ckzlVar4.d = awuiVar;
                ckzlVar4.b |= 1;
                return (ckzl) ckzkVar2.build();
            }
        }, this.b).i(new eroh() { // from class: wcw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cetp cetpVar = new cetp();
                cetpVar.a = conversationIdType.a();
                return ((cevh) wda.this.a.a.b()).b(ceyr.h("remove_members_from_rcs_conversation", (ckzl) obj, cetpVar.a()));
            }
        }, this.b).i(new eroh() { // from class: wcx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cevg) obj).a();
            }
        }, this.b).h(new emwl() { // from class: wcy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((ceyt) obj).e());
            }
        }, this.b);
    }
}
