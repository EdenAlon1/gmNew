package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrn implements ajre {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleReplies");
    public final asmi a;
    private final ajrp d;
    private final ctas e;

    public ajrn(ajrp ajrpVar, ctas ctasVar, asmi asmiVar) {
        ajrpVar.getClass();
        ctasVar.getClass();
        this.d = ajrpVar;
        this.e = ctasVar;
        this.a = asmiVar;
    }

    private final ajrz c(ajrz ajrzVar) {
        String str = ajrzVar.b == 11 ? (String) ajrzVar.c : "";
        if (str != null && str.length() != 0) {
            String str2 = ajrzVar.b == 11 ? (String) ajrzVar.c : "";
            ctas ctasVar = this.e;
            Uri parse = Uri.parse(str2);
            Object e = ajrd.a.e();
            e.getClass();
            int intValue = ((Number) e).intValue();
            Object e2 = ajrd.a.e();
            e2.getClass();
            byte[] b2 = ctasVar.b(parse, intValue, ((Number) e2).intValue(), ((Number) ajrd.b.e()).intValue());
            if (b2 != null) {
                ajrq ajrqVar = (ajrq) ajrr.a.createBuilder();
                ajrqVar.getClass();
                eyee x = eyee.x(b2);
                ajrqVar.copyOnWrite();
                ((ajrr) ajrqVar.instance).b = x;
                long intValue2 = ((Number) ajrd.a.e()).intValue();
                ajrqVar.copyOnWrite();
                ((ajrr) ajrqVar.instance).c = intValue2;
                long intValue3 = ((Number) ajrd.a.e()).intValue();
                ajrqVar.copyOnWrite();
                ((ajrr) ajrqVar.instance).d = intValue3;
                eyfy build = ajrqVar.build();
                build.getClass();
                ajrr ajrrVar = (ajrr) build;
                ajry ajryVar = (ajry) ajrzVar.toBuilder();
                ajryVar.copyOnWrite();
                ajrz ajrzVar2 = (ajrz) ajryVar.instance;
                if (ajrzVar2.b == 11) {
                    ajrzVar2.b = 0;
                    ajrzVar2.c = null;
                }
                ajryVar.copyOnWrite();
                ajrz ajrzVar3 = (ajrz) ajryVar.instance;
                ajrzVar3.c = ajrrVar;
                ajrzVar3.b = 12;
                eyfy build2 = ajryVar.build();
                build2.getClass();
                return (ajrz) build2;
            }
        }
        return null;
    }

    @Override // defpackage.ajre
    public final void a(final erzd erzdVar, final bcse bcseVar) {
        RepliedToDataAdapter repliedToDataAdapter;
        ajqt ajqtVar = bcseVar.f;
        if (ajqtVar != null) {
            efbd.b();
            try {
                repliedToDataAdapter = this.d.a(ajqtVar);
            } catch (IllegalStateException e) {
                ((ensz) ((ensz) c.i()).g(e)).q("Failed to extract replied-to data");
                repliedToDataAdapter = null;
            }
            if (repliedToDataAdapter != null) {
                repliedToDataAdapter.b(new ffji() { // from class: ajrf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ajso b2;
                        ajso ajsoVar = (ajso) obj;
                        ajsoVar.getClass();
                        ajrn ajrnVar = this;
                        boolean a = ((ersq) ((arpz) ajrnVar.a).a.b()).a("bugle.enable_message_id_v2_for_replied_to_message");
                        bcse bcseVar2 = bcseVar;
                        if (a) {
                            final ajso b3 = ajrm.b(ajsoVar, bcseVar2);
                            buxo d = MessagesTable.d();
                            d.z("setMessageIdV2ToRepliedToMessage");
                            d.f(new Function() { // from class: ajrg
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((buum) obj2).C;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.h(new Function() { // from class: ajrh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    buxz buxzVar = (buxz) obj2;
                                    buxzVar.q(bdhb.b(ajso.this.c));
                                    return buxzVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            d.x(1);
                            buuo buuoVar = (buuo) d.b().o();
                            if (buuoVar.moveToFirst()) {
                                ajsn ajsnVar = (ajsn) b3.toBuilder();
                                esoi esoiVar = (esoi) esoj.a.createBuilder();
                                String str = b3.c;
                                esoiVar.copyOnWrite();
                                esoj esojVar = (esoj) esoiVar.instance;
                                str.getClass();
                                esojVar.b = 1 | esojVar.b;
                                esojVar.c = str;
                                String f = buuoVar.r().f();
                                esoiVar.copyOnWrite();
                                esoj esojVar2 = (esoj) esoiVar.instance;
                                esojVar2.b |= 2;
                                esojVar2.d = f;
                                ajsnVar.copyOnWrite();
                                ajso ajsoVar2 = (ajso) ajsnVar.instance;
                                esoj esojVar3 = (esoj) esoiVar.build();
                                esojVar3.getClass();
                                ajsoVar2.h = esojVar3;
                                ajsoVar2.b |= 4;
                                eyfy build = ajsnVar.build();
                                build.getClass();
                                b3 = (ajso) build;
                            }
                            b2 = ajrnVar.b(b3);
                        } else {
                            b2 = ajrnVar.b(ajrm.b(ajsoVar, bcseVar2));
                        }
                        erzd erzdVar2 = erzd.this;
                        erzdVar2.copyOnWrite();
                        erzn erznVar = (erzn) erzdVar2.instance;
                        erzn erznVar2 = erzn.a;
                        erznVar.t = b2;
                        erznVar.b |= 64;
                        return ffcu.a;
                    }
                });
            }
        }
    }

    public final ajso b(ajso ajsoVar) {
        ajrt ajrtVar = ajsoVar.e;
        if (ajrtVar == null) {
            ajrtVar = ajrt.a;
        }
        ajsj ajsjVar = ajrtVar.e;
        if (ajsjVar == null) {
            ajsjVar = ajsj.a;
        }
        if (ajsjVar.b != 2) {
            return ajsoVar;
        }
        ajrt ajrtVar2 = ajsoVar.e;
        if (ajrtVar2 == null) {
            ajrtVar2 = ajrt.a;
        }
        ajsj ajsjVar2 = ajrtVar2.e;
        if (ajsjVar2 == null) {
            ajsjVar2 = ajsj.a;
        }
        ajrz ajrzVar = ajsjVar2.b == 2 ? (ajrz) ajsjVar2.c : ajrz.a;
        ajrzVar.getClass();
        String str = ajrzVar.d;
        str.getClass();
        ajrz c2 = le.n(str) ? c(ajrzVar) : le.A(str) ? c(ajrzVar) : le.z(str) ? c(ajrzVar) : null;
        if (c2 == null) {
            return ajsoVar;
        }
        eyfq builder = ajsoVar.toBuilder();
        builder.getClass();
        ajsn ajsnVar = (ajsn) builder;
        ajrt ajrtVar3 = ajsoVar.e;
        if (ajrtVar3 == null) {
            ajrtVar3 = ajrt.a;
        }
        eyfq builder2 = ajrtVar3.toBuilder();
        builder2.getClass();
        ajrs ajrsVar = (ajrs) builder2;
        ajrt ajrtVar4 = ajsoVar.e;
        if (ajrtVar4 == null) {
            ajrtVar4 = ajrt.a;
        }
        ajsj ajsjVar3 = ajrtVar4.e;
        if (ajsjVar3 == null) {
            ajsjVar3 = ajsj.a;
        }
        eyfq builder3 = ajsjVar3.toBuilder();
        builder3.getClass();
        ajsi ajsiVar = (ajsi) builder3;
        ajsiVar.copyOnWrite();
        ajsj ajsjVar4 = (ajsj) ajsiVar.instance;
        ajsjVar4.c = c2;
        ajsjVar4.b = 2;
        ajrsVar.copyOnWrite();
        ajrt ajrtVar5 = (ajrt) ajrsVar.instance;
        ajsj ajsjVar5 = (ajsj) ajsiVar.build();
        ajsjVar5.getClass();
        ajrtVar5.e = ajsjVar5;
        ajrtVar5.b |= 4;
        ajsnVar.copyOnWrite();
        ajso ajsoVar2 = (ajso) ajsnVar.instance;
        ajrt ajrtVar6 = (ajrt) ajrsVar.build();
        ajrtVar6.getClass();
        ajsoVar2.e = ajrtVar6;
        ajsoVar2.b |= 1;
        eyfy build = ajsnVar.build();
        build.getClass();
        return (ajso) build;
    }
}
