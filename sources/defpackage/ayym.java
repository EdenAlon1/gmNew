package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayym {
    public final errl c;
    public final ffbr d;
    private final ffbr f;
    private final ffbr g;
    private final ayvm h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private static final entd e = entd.c("BugleConversation");
    static final cfva a = cfvl.i(cfvl.b, "log_destinations_from_telephony", true);
    public static final cfva b = cfvl.i(cfvl.b, "bug_182819110", false);

    public ayym(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ayvm ayvmVar) {
        this.f = ffbrVar;
        this.d = ffbrVar2;
        this.c = errlVar;
        this.g = ffbrVar4;
        this.h = ayvmVar;
        this.i = ffbrVar3;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
    }

    public static epvd c(ayvk ayvkVar) {
        epvc epvcVar = (epvc) epvd.a.createBuilder();
        cfva cfvaVar = b;
        String f = ((Boolean) cfvaVar.e()).booleanValue() ? ayvkVar.f() : ayvkVar.e();
        epvcVar.copyOnWrite();
        epvd epvdVar = (epvd) epvcVar.instance;
        epvdVar.b |= 2;
        epvdVar.f = f;
        String d = ayvkVar.d();
        epvcVar.copyOnWrite();
        epvd epvdVar2 = (epvd) epvcVar.instance;
        epvdVar2.b |= 1;
        epvdVar2.e = d;
        ayvl a2 = ayvkVar.a();
        if (a2 != null) {
            epve epveVar = (epve) epvf.a.createBuilder();
            epveVar.copyOnWrite();
            epvf epvfVar = (epvf) epveVar.instance;
            epvfVar.b |= 2;
            ayhg ayhgVar = (ayhg) a2;
            epvfVar.d = ayhgVar.c;
            if (((Boolean) cfvaVar.e()).booleanValue() && ayhgVar.a.isPresent()) {
                int i = ((ctvf) ayhgVar.a.get()).a;
                epveVar.copyOnWrite();
                epvf epvfVar2 = (epvf) epveVar.instance;
                epvfVar2.b |= 1;
                epvfVar2.c = i;
            }
            epvf epvfVar3 = (epvf) epveVar.build();
            epvcVar.copyOnWrite();
            epvd epvdVar3 = (epvd) epvcVar.instance;
            epvfVar3.getClass();
            epvdVar3.d = epvfVar3;
            epvdVar3.c = 3;
        }
        epvb b2 = ayvkVar.b();
        if (b2 != null) {
            epvcVar.copyOnWrite();
            epvd epvdVar4 = (epvd) epvcVar.instance;
            epvdVar4.d = b2;
            epvdVar4.c = 5;
        }
        epvh c = ayvkVar.c();
        if (c != null) {
            epvcVar.copyOnWrite();
            epvd epvdVar5 = (epvd) epvcVar.instance;
            epvdVar5.d = c;
            epvdVar5.c = 4;
        }
        return (epvd) epvcVar.build();
    }

    static epwe e(ayvk ayvkVar) {
        epwd epwdVar = (epwd) epwe.a.createBuilder();
        ayvl a2 = ayvkVar.a();
        if (a2 == null) {
            return (epwe) epwdVar.build();
        }
        ayhg ayhgVar = (ayhg) a2;
        boolean isPresent = ayhgVar.b.isPresent();
        epwdVar.copyOnWrite();
        epwe epweVar = (epwe) epwdVar.instance;
        epweVar.b |= 1;
        epweVar.c = isPresent;
        Optional optional = ayhgVar.a;
        if (optional.isPresent()) {
            int i = ((ctvf) optional.get()).a;
            epwdVar.copyOnWrite();
            epwe epweVar2 = (epwe) epwdVar.instance;
            epweVar2.b |= 2;
            epweVar2.d = i;
        }
        return (epwe) epwdVar.build();
    }

    public static int f(bcyk bcykVar) {
        int L = bcykVar.L();
        if (L == 0) {
            return 2;
        }
        if (L != 1) {
            return L != 2 ? 1 : 4;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.List] */
    public final ayyl a(ConversationIdType conversationIdType) {
        Optional empty;
        bcyk a2 = ((bdeo) this.d.b()).a(conversationIdType);
        List L = ((bczy) this.f.b()).L(conversationIdType);
        epvi epviVar = (epvi) epvj.a.createBuilder();
        epvx epvxVar = (epvx) epvy.a.createBuilder();
        long b2 = ((asps) this.k.b()).a() ? ((akvz) this.j.b()).b(conversationIdType) : conversationIdType.a;
        epviVar.copyOnWrite();
        epvj epvjVar = (epvj) epviVar.instance;
        epvjVar.b |= 1;
        epvjVar.c = b2;
        if (a2 == null) {
            return new ayya((epvj) epviVar.build(), (epvy) epvxVar.build());
        }
        long a3 = cpxv.a(a2.j());
        epviVar.copyOnWrite();
        epvj epvjVar2 = (epvj) epviVar.instance;
        epvjVar2.b |= 2;
        epvjVar2.d = a3;
        if (((Boolean) a.e()).booleanValue() && a2.j().c() && ((cptp) this.g.b()).a()) {
            ekzz f = eleg.f("ConversationInfoCreator#populateTelephonyThreadRecipients");
            try {
                cpxu j = a2.j();
                if (!((cptp) this.g.b()).a()) {
                    empty = Optional.empty();
                } else if (j.d()) {
                    empty = Optional.empty();
                } else {
                    try {
                        empty = ((coxk) this.i.b()).C(j);
                    } catch (Throwable th) {
                        ((ensz) ((ensz) e.a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/conversation/match/logging/ConversationInfoCreator", "getTelephonyThreadRecipients", 212, "ConversationInfoCreator.java")).q("Unable to iterate through canonical recipients");
                        empty = Optional.empty();
                    }
                }
                if (!empty.isEmpty()) {
                    ?? r4 = empty.get();
                    int size = r4.size();
                    for (int i = 0; i < size; i++) {
                        ayvk a4 = this.h.a(emxe.b(((aoku) r4.get(i)).n()));
                        epvd c = c(a4);
                        epviVar.copyOnWrite();
                        epvj epvjVar3 = (epvj) epviVar.instance;
                        c.getClass();
                        eygr eygrVar = epvjVar3.h;
                        if (!eygrVar.c()) {
                            epvjVar3.h = eyfy.mutableCopy(eygrVar);
                        }
                        epvjVar3.h.add(c);
                        epwe e2 = e(a4);
                        epvxVar.copyOnWrite();
                        epvy epvyVar = (epvy) epvxVar.instance;
                        e2.getClass();
                        eygr eygrVar2 = epvyVar.c;
                        if (!eygrVar2.c()) {
                            epvyVar.c = eyfy.mutableCopy(eygrVar2);
                        }
                        epvyVar.c.add(e2);
                    }
                }
                f.close();
            } catch (Throwable th2) {
                try {
                    f.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (a2.L() == 2) {
            String x = a2.x();
            if (x == null) {
                x = "";
            }
            epvv epvvVar = (epvv) epvw.a.createBuilder();
            epvc epvcVar = (epvc) epvd.a.createBuilder();
            epvg epvgVar = (epvg) epvh.a.createBuilder();
            String c2 = this.h.c(x);
            epvgVar.copyOnWrite();
            epvh epvhVar = (epvh) epvgVar.instance;
            epvhVar.b |= 1;
            epvhVar.c = c2;
            epvcVar.copyOnWrite();
            epvd epvdVar = (epvd) epvcVar.instance;
            epvh epvhVar2 = (epvh) epvgVar.build();
            epvhVar2.getClass();
            epvdVar.d = epvhVar2;
            epvdVar.c = 4;
            epvvVar.copyOnWrite();
            epvw epvwVar = (epvw) epvvVar.instance;
            epvd epvdVar2 = (epvd) epvcVar.build();
            epvdVar2.getClass();
            epvwVar.c = epvdVar2;
            epvwVar.b |= 1;
            epviVar.a(epvvVar);
        } else {
            enqv it = ((engw) L).iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                epvv d = d(bindData);
                epvz epvzVar = (epvz) epwa.a.createBuilder();
                String U = bindData.U();
                if (U != null) {
                    epwe e3 = e(this.h.a(U));
                    epvzVar.copyOnWrite();
                    epwa epwaVar = (epwa) epvzVar.instance;
                    e3.getClass();
                    epwaVar.d = e3;
                    epwaVar.b |= 2;
                }
                String W = bindData.W();
                if (W != null) {
                    epwe e4 = e(this.h.a(W));
                    epvzVar.copyOnWrite();
                    epwa epwaVar2 = (epwa) epvzVar.instance;
                    e4.getClass();
                    epwaVar2.c = e4;
                    epwaVar2.b |= 1;
                }
                epvxVar.copyOnWrite();
                epvy epvyVar2 = (epvy) epvxVar.instance;
                epwa epwaVar3 = (epwa) epvzVar.build();
                epwaVar3.getClass();
                eygr eygrVar3 = epvyVar2.b;
                if (!eygrVar3.c()) {
                    epvyVar2.b = eyfy.mutableCopy(eygrVar3);
                }
                epvyVar2.b.add(epwaVar3);
                epviVar.a(d);
            }
        }
        int f2 = f(a2);
        epviVar.copyOnWrite();
        epvj epvjVar4 = (epvj) epviVar.instance;
        epvjVar4.e = f2 - 1;
        epvjVar4.b |= 4;
        boolean W2 = a2.W();
        epviVar.copyOnWrite();
        epvj epvjVar5 = (epvj) epviVar.instance;
        epvjVar5.b |= 8;
        epvjVar5.f = W2;
        return new ayya((epvj) epviVar.build(), (epvy) epvxVar.build());
    }

    public final elfl b(final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: ayyk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((ayya) ayym.this.a(conversationIdType)).a;
            }
        }, this.c);
    }

    public final epvv d(ParticipantsTable.BindData bindData) {
        epvv epvvVar = (epvv) epvw.a.createBuilder();
        String U = bindData.U();
        if (U != null) {
            epvd c = c(this.h.a(U));
            epvvVar.copyOnWrite();
            epvw epvwVar = (epvw) epvvVar.instance;
            c.getClass();
            epvwVar.c = c;
            epvwVar.b |= 1;
        }
        String W = bindData.W();
        if (W != null) {
            epvd c2 = c(this.h.a(W));
            epvvVar.copyOnWrite();
            epvw epvwVar2 = (epvw) epvvVar.instance;
            c2.getClass();
            epvwVar2.d = c2;
            epvwVar2.b |= 2;
        }
        if (bindData.o() == 1) {
            Optional b2 = this.h.b(cowe.a(bindData));
            b2.isPresent();
            epvc epvcVar = (epvc) epvd.a.createBuilder();
            Object obj = b2.get();
            epvcVar.copyOnWrite();
            epvd epvdVar = (epvd) epvcVar.instance;
            epvdVar.d = obj;
            epvdVar.c = 5;
            epvd epvdVar2 = (epvd) epvcVar.buildPartial();
            epvvVar.copyOnWrite();
            epvw epvwVar3 = (epvw) epvvVar.instance;
            epvdVar2.getClass();
            epvd epvdVar3 = epvwVar3.c;
            if (epvdVar3 != null && epvdVar3 != epvd.a) {
                epvc epvcVar2 = (epvc) epvd.a.createBuilder(epvdVar3);
                epvcVar2.mergeFrom((epvc) epvdVar2);
                epvdVar2 = (epvd) epvcVar2.buildPartial();
            }
            epvwVar3.c = epvdVar2;
            epvwVar3.b |= 1;
        }
        return epvvVar;
    }
}
