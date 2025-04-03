package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccdv implements cctr {
    @Override // defpackage.cctr
    public final List a() {
        String[] strArr = PartsTable.a;
        String[] strArr2 = bqii.a;
        return engw.r("CREATE TRIGGER on_parts_delete_save_blob_bk AFTER DELETE ON parts FOR EACH ROW BEGIN INSERT INTO cms_blobs_pending_delete (message_id,blob_id) SELECT OLD.message_id,OLD.cms_full_size_blob_id WHERE OLD.cms_full_size_blob_id IS NOT NULL; INSERT INTO cms_blobs_pending_delete (message_id,blob_id) SELECT OLD.message_id,OLD.cms_compressed_blob_id WHERE OLD.cms_compressed_blob_id IS NOT NULL; END");
    }

    @Override // defpackage.cctr
    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP TRIGGER IF EXISTS on_parts_delete_save_blob_bk");
        return arrayList;
    }
}
