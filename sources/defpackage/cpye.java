package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpye {
    public static final entd a = entd.c("BugleBackup");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final Context f;
    public final aqky g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final dtuu k;

    public cpye(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, dtuu dtuuVar, Context context, ffbr ffbrVar4, aqky aqkyVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.k = dtuuVar;
        this.f = context;
        this.e = ffbrVar4;
        this.h = ffbrVar5;
        this.g = aqkyVar;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
    }

    public static bdgc a(cqdh cqdhVar, cpxu cpxuVar, engw engwVar, boolean z, boolean z2, amer amerVar) {
        bdgc z3 = cqdhVar != null ? bdgd.z(cqdhVar) : bdgd.y();
        if (z2) {
            z3.x(true);
        }
        z3.l(false);
        z3.k(z);
        z3.v(true == z ? 2 : 1);
        z3.z(cpxuVar);
        z3.p(engwVar);
        z3.g(amerVar);
        return z3;
    }

    final bdgd b(final cqdh cqdhVar, final coux couxVar, final enip enipVar, final enip enipVar2) {
        return (bdgd) this.k.c("ConversationParametersCreator#createMmsConversationParameters", new emyl() { // from class: cpxz
            @Override // defpackage.emyl
            public final Object get() {
                ParticipantsTable.BindData c;
                coux couxVar2 = couxVar;
                cpxu cpxuVar = new cpxu(couxVar2.i);
                int i = engw.d;
                bdgc a2 = cpye.a(cqdhVar, cpxuVar, enou.a, true, false, amer.c);
                engw engwVar = enou.a;
                boolean isEmpty = TextUtils.isEmpty(couxVar2.o);
                final cpye cpyeVar = cpye.this;
                if (isEmpty) {
                    final String str = couxVar2.a;
                    if (str != null) {
                        final long j = couxVar2.i;
                        String str2 = ((cpza) cpyeVar.j.b()).b(new cpxu(j), new ffbr() { // from class: cpya
                            @Override // defpackage.ffbr, defpackage.ffbq
                            public final Object b() {
                                return ((cozl) cpye.this.i.b()).a(coto.a, j, str);
                            }
                        }).c;
                        Optional empty = str2 == null ? Optional.empty() : str2.isEmpty() ? Optional.empty() : Optional.of(str2);
                        if (empty.isPresent()) {
                            a2.h((String) empty.get());
                        }
                    }
                } else {
                    ckex c2 = ckey.c(couxVar2.o);
                    if (c2 != null) {
                        enip enipVar3 = (enip) Collection.EL.stream(enipVar2).map(new Function() { // from class: cpyc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                entd entdVar = cpye.a;
                                cfva cfvaVar = aoqm.a;
                                ((Boolean) new aoou().get()).booleanValue();
                                return Optional.ofNullable(((aoku) obj).p(false));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).map(new Function() { // from class: cpyd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                entd entdVar = cpye.a;
                                return (String) ((Optional) obj).orElse("ʼUNKNOWN_SENDER!ʼ");
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.b);
                        ckbd ckbdVar = (ckbd) c2;
                        if (ckbdVar.b.isPresent()) {
                            a2.l(true);
                            a2.r(((ckba) ckbdVar.b.get()).a);
                        } else if (ckbdVar.c.isPresent()) {
                            if (((ckbt) ckbdVar.c.get()).c == 2) {
                                a2.l(true);
                                ckbt ckbtVar = (ckbt) ckbdVar.c.get();
                                ckbr ckbrVar = ckbtVar.c == 2 ? (ckbr) ckbtVar.d : ckbr.a;
                                ((bczj) a2).c = Optional.of(ckbrVar.b);
                                a2.h(ckbrVar.c);
                                a2.r(ckbrVar.d);
                            } else if (((ckbt) ckbdVar.c.get()).c == 3) {
                                ensk o = cpye.a.o();
                                o.W(1, TimeUnit.SECONDS);
                                ((ensz) o.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 312, "ConversationParametersCreator.java")).q("Creating participant for RBM conversation");
                                ckbt ckbtVar2 = (ckbt) ckbdVar.c.get();
                                ckbp ckbpVar = ckbtVar2.c == 3 ? (ckbp) ckbtVar2.d : ckbp.a;
                                a2.z(((ckch) cpyeVar.b.b()).e(new cpay(ckbpVar.b, ckbpVar.c, ckbpVar.d)));
                                if (((Boolean) cpyeVar.h.b()).booleanValue()) {
                                    c = bdqu.e(ckbpVar.b, ckbpVar.c, ckbpVar.d).a();
                                    ((bdrr) cpyeVar.c.b()).i(c);
                                } else {
                                    c = bdqu.e(ckbpVar.b, ckbpVar.c, ckbpVar.d).c();
                                }
                                engwVar = engw.r(c);
                            } else if (!((Boolean) ((cfup) ctjd.ax.get()).e()).booleanValue() || (((ckbt) ckbdVar.c.get()).b & 1) == 0) {
                                a2.z(new cpxu(((coxk) cpyeVar.d.b()).g(cpyeVar.f, coto.b, enipVar3)));
                            } else {
                                ckbg ckbgVar = ((ckbt) ckbdVar.c.get()).f;
                                if (ckbgVar == null) {
                                    ckbgVar = ckbg.a;
                                }
                                String str3 = ckbgVar.b;
                                emxf.l(!str3.isEmpty());
                                engwVar = engw.r(cpyeVar.g.a(((aolr) cpyeVar.e.b()).n(str3)));
                            }
                        } else if (ckbdVar.a.isPresent() || ckbdVar.d.isPresent() || ckbdVar.e.isPresent()) {
                            a2.z(new cpxu(((coxk) cpyeVar.d.b()).g(cpyeVar.f, coto.a, enipVar3)));
                        } else {
                            ((ensz) ((ensz) cpye.a.j()).h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createConversationParametersWithTransactionId", 388, "ConversationParametersCreator.java")).t("Unknown message type  transactionId=%s", c2);
                        }
                    }
                }
                if (engwVar.isEmpty()) {
                    enip enipVar4 = enipVar;
                    ensk o2 = cpye.a.o();
                    o2.W(1, TimeUnit.SECONDS);
                    ((ensz) o2.h("com/google/android/apps/messaging/shared/telephony/forwardsync/ConversationParametersCreator", "createMmsConversationParametersForForwardSync", 268, "ConversationParametersCreator.java")).r("Creating [%s] participants for MMS or RCS conversation", enipVar4.size());
                    cfva cfvaVar = aoqm.a;
                    ((Boolean) new aoou().get()).booleanValue();
                    engwVar = cpyeVar.f(couxVar2.q, enipVar4);
                }
                a2.p(engwVar);
                return a2.A();
            }
        });
    }

    public final bdgd c(aoku aokuVar, int i, boolean z) {
        return d(null, aokuVar, i, new cpxu(), z);
    }

    public final bdgd d(cqdh cqdhVar, aoku aokuVar, int i, cpxu cpxuVar, boolean z) {
        return e(cqdhVar, bdqu.c(aokuVar, i), cpxuVar, z, false, amer.c);
    }

    public final bdgd e(final cqdh cqdhVar, final ParticipantsTable.BindData bindData, final cpxu cpxuVar, final boolean z, final boolean z2, final amer amerVar) {
        return (bdgd) this.k.c("ConversationParametersCreator#createSmsConversationParameters", new emyl() { // from class: cpyb
            @Override // defpackage.emyl
            public final Object get() {
                engw r = engw.r(ParticipantsTable.c(((bdrr) cpye.this.c.b()).i(bindData)));
                boolean z3 = z;
                return cpye.a(cqdhVar, cpxuVar, r, z3, z2, amerVar).A();
            }
        });
    }

    public final engw f(final int i, enip enipVar) {
        Stream map = Collection.EL.stream(enipVar).map(new Function() { // from class: cpxy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cpye cpyeVar = cpye.this;
                bdrr bdrrVar = (bdrr) cpyeVar.c.b();
                aolr aolrVar = (aolr) cpyeVar.e.b();
                int i2 = i;
                return ParticipantsTable.c(bdrrVar.i(bdqu.c(aolrVar.u((String) obj, i2), i2)));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final bdgd g(enip enipVar, int i, boolean z) {
        cfva cfvaVar = aoqm.a;
        ((Boolean) new aoou().get()).booleanValue();
        emxf.a(!enipVar.isEmpty());
        cpxu cpxuVar = new cpxu();
        ((Boolean) new aoou().get()).booleanValue();
        return a(null, cpxuVar, f(i, enipVar), z, false, amer.c).A();
    }
}
