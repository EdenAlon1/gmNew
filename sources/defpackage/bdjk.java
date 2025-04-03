package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjk {
    public static final cskc a = cskc.g("BugleDataModel", "ConversationMessageListDatabaseOperations");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final atky e;

    public bdjk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, atky atkyVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = atkyVar;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [fazb, java.lang.Object] */
    public static List a(ffbr ffbrVar, bifu bifuVar) {
        ekzz f = eleg.f("ConversationMessageListDatabaseOperations#bindConversationMessageDataCursor");
        try {
            bcsf bcsfVar = (bcsf) ffbrVar.b();
            ArrayList arrayList = new ArrayList(bifuVar.getCount());
            bcse bcseVar = null;
            bcse bcseVar2 = null;
            while (bifuVar.moveToNext()) {
                crji crjiVar = (crji) bcsfVar.a.b();
                crjiVar.getClass();
                bcwz bcwzVar = (bcwz) bcsfVar.b.b();
                bcwzVar.getClass();
                bdjs bdjsVar = (bdjs) bcsfVar.c.b();
                bdjsVar.getClass();
                bzqa bzqaVar = (bzqa) bcsfVar.d.b();
                bzqaVar.getClass();
                caao caaoVar = (caao) bcsfVar.e.b();
                caaoVar.getClass();
                aolr aolrVar = (aolr) bcsfVar.f.b();
                aolrVar.getClass();
                ?? b = bcsfVar.g.b();
                b.getClass();
                ffbr ffbrVar2 = bcsfVar.h;
                ffbr ffbrVar3 = bcsfVar.i;
                cbwg cbwgVar = (cbwg) bcsfVar.j.b();
                cbwgVar.getClass();
                cbvv cbvvVar = (cbvv) bcsfVar.k.b();
                cbvvVar.getClass();
                ?? b2 = bcsfVar.l.b();
                b2.getClass();
                ((auod) bcsfVar.m.b()).getClass();
                bcse bcseVar3 = new bcse(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, (fazb) b, ffbrVar2, ffbrVar3, cbwgVar, cbvvVar, (fazb) b2, bifuVar, (byte[]) null);
                arrayList.add(bcseVar3);
                if (bcseVar2 != null) {
                    if (bcseVar2.aE(bcseVar3)) {
                        bcseVar2.bf(bcseVar3);
                        bcseVar3.be(bcseVar2);
                    } else {
                        bcseVar3.bf(bcseVar2);
                        bcseVar2.be(bcseVar3);
                        bcseVar2 = bcseVar3;
                    }
                }
                bcseVar = bcseVar3;
                bcseVar2 = bcseVar3;
            }
            if (bcseVar != null) {
                bcseVar.bh();
            }
            f.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0, types: [fazb, java.lang.Object] */
    public static List b(ffbr ffbrVar, bjjd bjjdVar) {
        ekzz f = eleg.f("ConversationMessageListDatabaseOperations#bindConversationMessageDataCursor");
        try {
            bcsf bcsfVar = (bcsf) ffbrVar.b();
            ArrayList arrayList = new ArrayList(bjjdVar.getCount());
            bcse bcseVar = null;
            bcse bcseVar2 = null;
            while (bjjdVar.moveToNext()) {
                crji crjiVar = (crji) bcsfVar.a.b();
                crjiVar.getClass();
                bcwz bcwzVar = (bcwz) bcsfVar.b.b();
                bcwzVar.getClass();
                bdjs bdjsVar = (bdjs) bcsfVar.c.b();
                bdjsVar.getClass();
                bzqa bzqaVar = (bzqa) bcsfVar.d.b();
                bzqaVar.getClass();
                caao caaoVar = (caao) bcsfVar.e.b();
                caaoVar.getClass();
                aolr aolrVar = (aolr) bcsfVar.f.b();
                aolrVar.getClass();
                ?? b = bcsfVar.g.b();
                b.getClass();
                ffbr ffbrVar2 = bcsfVar.h;
                ffbr ffbrVar3 = bcsfVar.i;
                cbwg cbwgVar = (cbwg) bcsfVar.j.b();
                cbwgVar.getClass();
                cbvv cbvvVar = (cbvv) bcsfVar.k.b();
                cbvvVar.getClass();
                ?? b2 = bcsfVar.l.b();
                b2.getClass();
                ((auod) bcsfVar.m.b()).getClass();
                bcse bcseVar3 = new bcse(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, (fazb) b, ffbrVar2, ffbrVar3, cbwgVar, cbvvVar, (fazb) b2, bjjdVar, (byte[]) null);
                arrayList.add(bcseVar3);
                if (bcseVar2 != null) {
                    if (bcseVar2.aE(bcseVar3)) {
                        bcseVar2.bf(bcseVar3);
                        bcseVar3.be(bcseVar2);
                    } else {
                        bcseVar3.bf(bcseVar2);
                        bcseVar2.be(bcseVar3);
                        bcseVar2 = bcseVar3;
                    }
                }
                bcseVar = bcseVar3;
                bcseVar2 = bcseVar3;
            }
            if (bcseVar != null) {
                bcseVar.bh();
            }
            f.close();
            return arrayList;
        } finally {
        }
    }

    public final List c(Collection collection) {
        List b;
        ekzz f = eleg.f("ConversationMessageListDatabaseOperations#loadConversationMessagesIn");
        try {
            csix.h();
            csix.q(collection.size());
            csjb a2 = a.a();
            a2.I("ConversationMessageListDatabaseOperations LoadConversationMessagesIn starts.");
            a2.r();
            if (this.e.a()) {
                bifu bifuVar = (bifu) ((bcsy) this.d.b()).f((MessageIdType[]) collection.toArray(new MessageIdType[0])).o();
                try {
                    b = a(this.b, bifuVar);
                    bifuVar.close();
                } finally {
                }
            } else {
                bjjd bjjdVar = (bjjd) ((bcsq) this.c.b()).g((MessageIdType[]) collection.toArray(new MessageIdType[0])).o();
                try {
                    b = b(this.b, bjjdVar);
                    bjjdVar.close();
                } finally {
                }
            }
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bjjd d(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationMessageListDatabaseOperations#getLastMessagesInConversation");
        try {
            bjjd bjjdVar = (bjjd) ((bcsq) this.c.b()).d(conversationIdType, 1, 0).b().o();
            f.close();
            return bjjdVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bifu e(ConversationIdType conversationIdType) {
        ekzz f = eleg.f("ConversationMessageListDatabaseOperations#getLastMessagesInConversation");
        try {
            bifu bifuVar = (bifu) ((bcsy) this.d.b()).c(conversationIdType, 1, 0).b().o();
            f.close();
            return bifuVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
