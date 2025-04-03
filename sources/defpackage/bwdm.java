package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdm extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bwdj(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        bwdm[] bwdmVarArr = new bwdm[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = PartsTable.a;
            apply = function.apply(new bwdm());
            bwdmVarArr[i] = (bwdm) apply;
        }
        ar(bwdmVarArr);
    }

    public final void c() {
        int intValue = PartsTable.e().intValue();
        if (intValue < 40040) {
            dtub.w("cms_full_size_blob_id", intValue);
        }
        aq(new dtrt("parts.cms_full_size_blob_id", 1, ""));
    }

    public final void d() {
        int intValue = PartsTable.e().intValue();
        if (intValue < 40040) {
            dtub.w("cms_full_size_blob_id", intValue);
        }
        aq(new dtrx("parts.cms_full_size_blob_id", 6));
    }

    public final void e() {
        int intValue = PartsTable.e().intValue();
        if (intValue < 40040) {
            dtub.w("cms_full_size_blob_id", intValue);
        }
        aq(new dtrx("parts.cms_full_size_blob_id", 5));
    }

    public final void f(String str) {
        aq(new dtrt("parts.content_type", 1, str));
    }

    public final void g(String str) {
        aq(new dtrt("parts.content_type", 11, str));
    }

    public final void h(Iterable iterable) {
        aq(new dtrw("parts.content_type", 4, at(iterable), false));
    }

    public final void i(ConversationIdType conversationIdType) {
        aq(new dtrt("parts.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void j(String str) {
        aq(new dtrt("parts._id", 1, String.valueOf(str)));
    }

    public final void k(Iterable iterable) {
        aq(new dtrw("parts._id", 3, at(iterable), false));
    }

    public final void l() {
        int intValue = PartsTable.e().intValue();
        if (intValue < 52050) {
            dtub.w("local_cache_path", intValue);
        }
        aq(new dtrx("parts.local_cache_path", 6));
    }

    public final void m(byza byzaVar) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 58150) {
            dtub.w("media_send_type", intValue);
        }
        aq(new dtwe("parts.media_send_type", 1, Integer.valueOf(byzaVar == null ? 0 : byzaVar.ordinal())));
    }

    public final void n(MessageIdType messageIdType) {
        aq(new dtrt("parts.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void o(dtzj dtzjVar) {
        aq(new dtru("parts.message_id", 3, dtzjVar));
    }

    public final void p(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("parts.message_id", 3, at(engrVar.g()), true));
    }

    public final void q(Uri uri) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 10021) {
            dtub.w("original_uri", intValue);
        }
        aq(new dtrt("parts.original_uri", 1, uri));
    }

    public final void r(Uri uri) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 4020) {
            dtub.w("output_uri", intValue);
        }
        aq(new dtrt("parts.output_uri", 1, uri));
    }

    public final void s() {
        int intValue = PartsTable.e().intValue();
        if (intValue < 4020) {
            dtub.w("output_uri", intValue);
        }
        aq(new dtrx("parts.output_uri", 6));
    }

    public final void t(byzc byzcVar) {
        int intValue = PartsTable.e().intValue();
        if (intValue < 4020) {
            dtub.w("processing_status", intValue);
        }
        aq(new dtwe("parts.processing_status", 2, Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal())));
    }

    public final void u() {
        aq(new dtrx("parts.text", 6));
    }

    public final void v(Uri uri) {
        aq(new dtrt("parts.uri", 1, uri));
    }

    public final void w() {
        aq(new dtrt("parts.uri", 11, "android.resource%"));
    }

    public final void x() {
        aq(new dtrx("parts.uri", 6));
    }

    public final void y() {
        aq(new dtrx("parts.uri", 5));
    }

    public final void z(Uri uri) {
        aq(new dtrt("parts.uri", 2, uri));
    }
}
