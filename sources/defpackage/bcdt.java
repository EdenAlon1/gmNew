package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdt implements dtqq {
    public static final bcdt a = new bcdt();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("message_id"), d("message_id")), new ffcf(c("content_type"), d("content_type")), new ffcf(c("source"), d("source")), new ffcf(c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)), new ffcf(c("width"), d("width")), new ffcf(c("height"), d("height")), new ffcf(c("longitude"), d("longitude")), new ffcf(c("latitude"), d("latitude")), new ffcf(c("cms_full_size_blob_id"), d("cms_full_size_blob_id")), new ffcf(c("cms_media_encryption_key"), d("cms_media_encryption_key")), new ffcf(c("cms_compressed_media_encryption_key"), d("cms_compressed_media_encryption_key")), new ffcf(c("cms_compressed_blob_id"), d("cms_compressed_blob_id")), new ffcf(c("file_name"), d("file_name")), new ffcf(c("duration"), d("duration")));

    private bcdt() {
    }

    private static final bccq c(String str) {
        dtry[] a2 = bcdn.a();
        for (int i = 0; i < 15; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bccq) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bwau d(String str) {
        dtry[] a2 = bwdb.a();
        for (int i = 0; i < 52; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bwau) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bcds.a;
        bcdj bcdjVar = new bcdj();
        bcdjVar.f("clearBackupTable");
        bcdjVar.e();
        bcdjVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bcds.a;
        dtvx dtvxVar = new dtvx("parts_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bccq[] bccqVarArr = (bccq[]) map.keySet().toArray(new bccq[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bccqVarArr, bccqVarArr.length));
        bwdf c = PartsTable.c();
        c.r();
        bwau[] bwauVarArr = (bwau[]) map.values().toArray(new bwau[0]);
        c.c((bwau[]) Arrays.copyOf(bwauVarArr, bwauVarArr.length));
        dtvxVar.c = c.b();
        dtvxVar.a().a();
    }
}
