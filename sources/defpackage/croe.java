package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class croe implements croc {
    static final cfup a = cfvl.i(cfvl.b, "disable_logging_archive_api_impl", false);
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl");
    final cskc c = cskc.g("Bugle", "ArchiveApiImpl");
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final cbgf g;
    public final bbfd h;
    public final ffbr i;
    public final akvy j;
    public final cube k;
    private final dtuu l;

    public croe(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cbgf cbgfVar, bbfd bbfdVar, dtuu dtuuVar, ffbr ffbrVar4, akvy akvyVar, cube cubeVar) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = cbgfVar;
        this.h = bbfdVar;
        this.l = dtuuVar;
        this.i = ffbrVar4;
        this.j = akvyVar;
        this.k = cubeVar;
    }

    private final engw d(final engw engwVar, final byyt byytVar, final eoko eokoVar, final boolean z) {
        efbd.b();
        return (engw) this.l.c("ArchiveApiImpl#setStatusOnConversations", new emyl() { // from class: crod
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emyl
            public final Object get() {
                croe croeVar;
                HashMap hashMap = new HashMap();
                final engw engwVar2 = engwVar;
                int size = engwVar2.size();
                int i = 0;
                while (true) {
                    croeVar = croe.this;
                    if (i >= size) {
                        break;
                    }
                    ConversationIdType conversationIdType = (ConversationIdType) engwVar2.get(i);
                    byyt s = ((bczy) croeVar.d.b()).s(conversationIdType);
                    if (s != null) {
                        hashMap.put(conversationIdType, s);
                    }
                    i++;
                }
                csjb c = croeVar.c.c();
                c.I("Previous archive status of conversations");
                c.A("conversationToPreviousArchiveStatus", hashMap);
                c.r();
                final bdgh bdghVar = (bdgh) croeVar.e.b();
                efbd.b();
                cesg cesgVar = (cesg) cesh.a.createBuilder();
                List list = (List) Collection.EL.stream(engwVar2).map(new Function() { // from class: bdgn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ConversationIdType) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bdgm()));
                cesgVar.copyOnWrite();
                cesh ceshVar = (cesh) cesgVar.instance;
                eygr eygrVar = ceshVar.c;
                if (!eygrVar.c()) {
                    ceshVar.c = eyfy.mutableCopy(eygrVar);
                }
                final byyt byytVar2 = byytVar;
                eydl.addAll(list, ceshVar.c);
                int ordinal = byytVar2.ordinal();
                cesgVar.copyOnWrite();
                cesh ceshVar2 = (cesh) cesgVar.instance;
                ceshVar2.b |= 1;
                ceshVar2.d = ordinal;
                final cesh ceshVar3 = (cesh) cesgVar.build();
                engw engwVar3 = (engw) bdghVar.b.c("ConversationDatabaseOperationsImpl#setConversationsArchiveStatus", new emyl() { // from class: bdgf
                    @Override // defpackage.emyl
                    public final Object get() {
                        efbd.b();
                        bdgh bdghVar2 = bdgh.this;
                        emxf.l(bdghVar2.b.i());
                        final engr engrVar = new engr();
                        for (ConversationIdType conversationIdType2 : engwVar2) {
                            byyt byytVar3 = byytVar2;
                            String[] strArr = bsom.a;
                            bsoe bsoeVar = new bsoe();
                            bsoeVar.ap("setConversationsArchiveStatusLocally");
                            bsoeVar.h(byytVar3);
                            if (((bczy) bdghVar2.a.b()).ak(conversationIdType2, bsoeVar)) {
                                engrVar.h(conversationIdType2);
                            }
                        }
                        cesh ceshVar4 = ceshVar3;
                        String[] strArr2 = bryh.a;
                        brxz brxzVar = new brxz();
                        brxzVar.f("setConversationsArchiveStatusLocally");
                        brxzVar.a(new Function() { // from class: bdgg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bryg brygVar = (bryg) obj;
                                brygVar.c(engr.this.g());
                                return brygVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brxzVar.d();
                        engw g = engrVar.g();
                        ((cevh) ((cesi) bdghVar2.c.b()).a.b()).a(ceyr.g("UPDATE_ARCHIVE_STATUS", ceshVar4));
                        return g;
                    }
                });
                csjb c2 = croeVar.c.c();
                c2.I("ArchivedStatus modified for the following conversations.");
                c2.A("ConversationIds", engwVar3);
                c2.A("newArchiveStatus", byytVar2);
                c2.r();
                int size2 = engwVar3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ConversationIdType conversationIdType2 = (ConversationIdType) engwVar3.get(i2);
                    String a2 = croeVar.k.a(conversationIdType2);
                    if (byytVar2.g() && croeVar.k.b(a2)) {
                        cube cubeVar = croeVar.k;
                        axol.k(cubeVar.b, null, new cubd(cubeVar, a2, null), 3);
                    }
                    if (byytVar2.d() && !conversationIdType2.b()) {
                        if (z) {
                            croeVar.h.d(conversationIdType2);
                        } else {
                            ensk h = croe.b.h();
                            h.Y(ente.a, "BugleNotifications");
                            enrr enrrVar = (enrr) h;
                            enrrVar.Y(csux.o, conversationIdType2.toString());
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/archive/ArchiveApiImpl", "setStatusOnConversations", 175, "ArchiveApiImpl.java")).q("Archiving conversation, canceling IM notification");
                            ((cjbc) croeVar.i.b()).a(conversationIdType2);
                        }
                    }
                    if (!((Boolean) croe.a.e()).booleanValue()) {
                        eoko eokoVar2 = eokoVar;
                        byyt byytVar3 = (byyt) hashMap.get(conversationIdType2);
                        crog crogVar = (crog) croeVar.f.b();
                        eokw e = croeVar.j.e(conversationIdType2);
                        e.getClass();
                        conversationIdType2.getClass();
                        eokoVar2.getClass();
                        byytVar2.getClass();
                        axol.m(crogVar.f, new crof(crogVar, e, conversationIdType2, eokoVar2, byytVar2, byytVar3, null));
                    }
                    croeVar.g.d(conversationIdType2);
                }
                return engwVar3;
            }
        });
    }

    @Override // defpackage.croc
    public final boolean a(ConversationIdType conversationIdType, byyt byytVar, eoko eokoVar) {
        efbd.b();
        ekzz f = eleg.f("ArchiveApiImpl::setStatusOnConversation");
        try {
            boolean b2 = b(conversationIdType, byytVar, eokoVar, true);
            f.close();
            return b2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.croc
    public final boolean b(ConversationIdType conversationIdType, byyt byytVar, eoko eokoVar, boolean z) {
        efbd.b();
        return d(engw.r(conversationIdType), byytVar, eokoVar, z).size() == 1;
    }

    @Override // defpackage.croc
    public final engw c(engw engwVar, byyt byytVar, eoko eokoVar) {
        efbd.b();
        return d(engwVar, byytVar, eokoVar, true);
    }
}
