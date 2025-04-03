package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdi extends duak {
    public bwdi() {
        super("parts");
    }

    public final void A() {
        this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
    }

    public final void B(int i) {
        this.a.put("width", Integer.valueOf(i));
    }

    public final void C(bwdm bwdmVar) {
        af(new bwdj(bwdmVar));
    }

    public final void D(Function function) {
        Object apply;
        String[] strArr = PartsTable.a;
        apply = function.apply(new bwdm());
        af(new bwdj((bwdm) apply));
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwdh b() {
        ah();
        return new bwdh(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final boolean c(String str) {
        String[] strArr = PartsTable.a;
        bwdm bwdmVar = new bwdm();
        bwdmVar.j(str);
        return aj(new bwdj(bwdmVar), "parts-buildAndUpdateForId");
    }

    public final void d(boolean z) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 53040) {
            dtub.w("awaiting_reverse_sync", intValue2);
        }
        if (intValue >= 53040) {
            this.a.put("awaiting_reverse_sync", Boolean.valueOf(z));
        }
    }

    public final void e() {
        this.a.putNull("blob_id");
    }

    public final void f(byyu byyuVar) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 44010) {
            dtub.w("cms_attachment_processing_status", intValue2);
        }
        if (intValue >= 44010) {
            if (byyuVar == null) {
                this.a.putNull("cms_attachment_processing_status");
            } else {
                this.a.put("cms_attachment_processing_status", Integer.valueOf(byyuVar.ordinal()));
            }
        }
    }

    public final void g(String str) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 40040) {
            dtub.w("cms_compressed_blob_id", intValue2);
        }
        if (intValue >= 40040) {
            dtub.u(this.a, "cms_compressed_blob_id", str);
        }
    }

    public final void h(String str) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 40040) {
            dtub.w("cms_full_size_blob_id", intValue2);
        }
        if (intValue >= 40040) {
            dtub.u(this.a, "cms_full_size_blob_id", str);
        }
    }

    public final void i(byte[] bArr) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 42010) {
            dtub.w("cms_media_encryption_key", intValue2);
        }
        if (intValue >= 42010) {
            this.a.put("cms_media_encryption_key", bArr);
        }
    }

    public final void j(String str) {
        dtub.u(this.a, "content_type", str);
    }

    public final void k(ConversationIdType conversationIdType) {
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            this.a.putNull("conversation_id");
        } else {
            this.a.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
        }
    }

    public final void l(long j) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 26040) {
            dtub.w("duration", intValue2);
        }
        if (intValue >= 26040) {
            this.a.put("duration", Long.valueOf(j));
        }
    }

    public final void m(Uri uri) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 13000) {
            dtub.w("fallback_uri", intValue2);
        }
        if (intValue >= 13000) {
            this.a.put("fallback_uri", uri.toString());
        }
    }

    public final void n(long j) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 52050) {
            dtub.w("file_size_bytes", intValue2);
        }
        if (intValue >= 52050) {
            this.a.put("file_size_bytes", Long.valueOf(j));
        }
    }

    public final void o() {
        this.a.putNull("file_size_bytes");
    }

    public final void p(int i) {
        this.a.put("height", Integer.valueOf(i));
    }

    public final void q(byyz byyzVar) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 60240) {
            dtub.w("image_display_state", intValue2);
        }
        if (intValue >= 60240) {
            if (byyzVar == null) {
                this.a.putNull("image_display_state");
            } else {
                this.a.put("image_display_state", Integer.valueOf(byyzVar.ordinal()));
            }
        }
    }

    public final void r(String str) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 52050) {
            dtub.w("local_cache_path", intValue2);
        }
        if (intValue >= 52050) {
            dtub.u(this.a, "local_cache_path", str);
        }
    }

    public final void s() {
        this.a.putNull("local_cache_path");
    }

    public final void t(boolean z) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 52030) {
            dtub.w("missing_entry_in_telephony", intValue2);
        }
        if (intValue >= 52030) {
            this.a.put("missing_entry_in_telephony", Boolean.valueOf(z));
        }
    }

    public final void u(Uri uri) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 10017) {
            dtub.w("preview_content_uri", intValue2);
        }
        if (intValue >= 10017) {
            if (uri == null) {
                this.a.putNull("preview_content_uri");
            } else {
                this.a.put("preview_content_uri", uri.toString());
            }
        }
    }

    public final void v() {
        this.a.putNull("output_uri");
    }

    public final void w(byzc byzcVar) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 4020) {
            dtub.w("processing_status", intValue2);
        }
        if (intValue >= 4020) {
            if (byzcVar == null) {
                this.a.putNull("processing_status");
            } else {
                this.a.put("processing_status", Integer.valueOf(byzcVar.ordinal()));
            }
        }
    }

    public final void x(byzh byzhVar) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 60230) {
            dtub.w("rich_card_media_download_failure_reason", intValue2);
        }
        if (intValue >= 60230) {
            if (byzhVar == null) {
                this.a.putNull("rich_card_media_download_failure_reason");
            } else {
                this.a.put("rich_card_media_download_failure_reason", Integer.valueOf(byzhVar.ordinal()));
            }
        }
    }

    public final void y(long j) {
        int intValue = PartsTable.e().intValue();
        int intValue2 = PartsTable.e().intValue();
        if (intValue2 < 4020) {
            dtub.w("target_size", intValue2);
        }
        if (intValue >= 4020) {
            this.a.put("target_size", Long.valueOf(j));
        }
    }

    public final void z(Uri uri) {
        if (uri == null) {
            this.a.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        } else {
            this.a.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
        }
    }
}
