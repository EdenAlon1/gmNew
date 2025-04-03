package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqlm {
    public static final void a(aqln aqlnVar, bsdl bsdlVar) {
        dtsu o = bsdlVar.o();
        try {
            bsdb bsdbVar = (bsdb) o;
            while (bsdbVar.moveToNext()) {
                aqlnVar.a.add(new BugleConversationId(bsdbVar.e()));
            }
            ffig.a(o, null);
        } finally {
        }
    }

    public static final void b(aqln aqlnVar, bvvn bvvnVar) {
        dtsu o = bvvnVar.b().o();
        try {
            bvti bvtiVar = (bvti) o;
            while (bvtiVar.moveToNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bvtiVar.cO();
                if (bindData.r() > -2) {
                    aqlnVar.b.set(true);
                } else {
                    String[] strArr = bsdr.a;
                    Iterator a = ffjw.a((bscj[]) bindData.aG("conversation_to_participants", new bscj[0]));
                    while (a.hasNext()) {
                        aqlnVar.a.add(new BugleConversationId(((bscj) a.next()).m()));
                    }
                }
            }
            ffig.a(o, null);
        } finally {
        }
    }

    public static final void c(aqln aqlnVar, bwon bwonVar) {
        dtsu o = bwonVar.b().o();
        try {
            bwnm bwnmVar = (bwnm) o;
            while (bwnmVar.moveToNext()) {
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) bwnmVar.cO();
                String[] strArr = bsdr.a;
                Iterator a = ffjw.a((bscj[]) bindData.aG("conversation_to_participants", new bscj[0]));
                while (a.hasNext()) {
                    aqlnVar.a.add(new BugleConversationId(((bscj) a.next()).m()));
                }
            }
            ffig.a(o, null);
        } finally {
        }
    }

    public static final void d(bvvn bvvnVar) {
        String[] strArr = bsdr.a;
        bvvnVar.G(dtvz.i(new bsdm(bsdr.a).b(), bsdr.c.b, ParticipantsTable.c.a).g());
    }

    public static final void e(bwon bwonVar) {
        String[] strArr = bsdr.a;
        bwonVar.G(dtvz.i(new bsdm(bsdr.a).b(), bsdr.c.b, ProfilesTable.c.b).g());
    }
}
