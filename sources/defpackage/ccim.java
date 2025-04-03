package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccim implements cctr {
    public static final /* synthetic */ int a = 0;
    private static final entd c = entd.c("BugleCms");
    private final ashh d;
    private final cctp e;
    private final axkm f;
    private final ffbr g;

    public ccim(cctp cctpVar, axkm axkmVar, ashh ashhVar, ffbr ffbrVar) {
        this.e = cctpVar;
        this.f = axkmVar;
        this.d = ashhVar;
        this.g = ffbrVar;
    }

    @Override // defpackage.cctr
    public final List a() {
        engw engwVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e.a(2, becg.INSERT, ccue.a(17)).a());
        ((ensz) ((ensz) c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsConversationTriggers", "getCreateTriggersSqls", 61, "CmsConversationTriggers.java")).q("Creating trigger SQL for delete conversation");
        bech e = this.e.e(2, becg.DELETE, ccue.a(9), true);
        e.i = "cms_id";
        arrayList.add(e.a());
        bech a2 = this.e.a(2, becg.UPDATE, ccue.a(3));
        a2.d = enkr.c("snippet_text", "sort_timestamp", "archive_status");
        a2.a = ccue.b(3);
        arrayList.add(a2.a());
        bech a3 = this.e.a(2, becg.UPDATE, ccue.a(5));
        a3.d = enkr.c("name", "icon", "current_self_id", "participant_id_list", "join_state", "conv_type", "send_mode", "marked_as_unread");
        a3.a = ccue.b(5);
        arrayList.add(a3.a());
        if (this.f.al()) {
            bech a4 = this.e.b(6, becg.INSERT).a(2, "conversation_id");
            a4.f = 2;
            a4.g = ccue.a(5);
            arrayList.add(a4.a());
            bech a5 = this.e.b(6, becg.DELETE).a(2, "conversation_id");
            a5.f = 2;
            a5.g = ccue.a(5);
            arrayList.add(a5.a());
        } else {
            bech bechVar = new bech();
            bechVar.c = becg.INSERT;
            bechVar.e = 32;
            bechVar.b = 6;
            bechVar.f = 2;
            bechVar.i = "conversation_id";
            bechVar.c();
            bechVar.h = this.d.a();
            bechVar.g = ccue.a(5);
            arrayList.add(bechVar.a());
            bech bechVar2 = new bech();
            bechVar2.c = becg.DELETE;
            bechVar2.e = 32;
            bechVar2.b = 6;
            bechVar2.f = 2;
            bechVar2.i = "conversation_id";
            bechVar2.c();
            bechVar2.h = this.d.a();
            bechVar2.g = ccue.a(5);
            arrayList.add(bechVar2.a());
        }
        if (csgj.a()) {
            if (((Optional) this.g.b()).isPresent()) {
                Stream flatMap = Collection.EL.stream(((Map) ((Optional) this.g.b()).get()).values()).flatMap(new Function() { // from class: ccik
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        int i = ccim.a;
                        return Collection.EL.stream(((csdr) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                engwVar = (engw) flatMap.collect(endq.a);
            } else {
                int i2 = engw.d;
                engwVar = enou.a;
            }
            arrayList.addAll(engwVar);
        }
        return arrayList;
    }

    @Override // defpackage.cctr
    public final List b() {
        engw engwVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e.c(2, becg.INSERT));
        arrayList.add(this.e.c(2, becg.DELETE));
        arrayList.add(this.e.f(3));
        arrayList.add(this.e.f(5));
        arrayList.add(this.e.f(9));
        arrayList.add(this.e.c(6, becg.INSERT));
        arrayList.add(this.e.c(6, becg.DELETE));
        if (((Optional) this.g.b()).isPresent()) {
            Stream flatMap = Collection.EL.stream(((Map) ((Optional) this.g.b()).get()).values()).flatMap(new Function() { // from class: ccil
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = ccim.a;
                    return Collection.EL.stream(((csdr) obj).c());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engwVar = (engw) flatMap.collect(endq.a);
        } else {
            int i2 = engw.d;
            engwVar = enou.a;
        }
        arrayList.addAll(engwVar);
        return arrayList;
    }
}
