package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdo implements fbba {
    public static dtux a() {
        return new dtuf(PartsTable.e, "parts", new dtue() { // from class: bwcz
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = PartsTable.a;
                valueOf.getClass();
                switch (i) {
                    case 3010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN timestamp INT;");
                        break;
                    case 4020:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN output_uri TEXT;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN target_size INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN processing_status INT DEFAULT(0);");
                        break;
                    case 5020:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN sticker_set_id INT DEFAULT(-1);");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN sticker_id INT DEFAULT(-1);");
                        break;
                    case 7000:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN media_modified_timestamp INT DEFAULT(-1);");
                        break;
                    case 10005:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN longitude REAL DEFAULT(0);");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN latitude REAL DEFAULT(0);");
                        break;
                    case 10017:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN preview_content_uri TEXT;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN preview_content_type TEXT;");
                        break;
                    case 10021:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN original_uri TEXT;");
                        break;
                    case 13000:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN fallback_uri TEXT;");
                        break;
                    case 14010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN source INT DEFAULT(13);");
                        break;
                    case 17010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN bundle_index INT DEFAULT(0);");
                        break;
                    case 17020:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN blob_id TEXT;");
                        break;
                    case 18000:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN blob_upload_permanent_failure INT DEFAULT(0);");
                        break;
                    case 19030:
                        PartsTable.f(dtveVar);
                        break;
                    case 22060:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN expressive_sticker_name TEXT;");
                        break;
                    case 26000:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN file_name TEXT;");
                        break;
                    case 26040:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN duration INT;");
                        break;
                    case 27000:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN compressed_blob_id TEXT;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN compressed_blob_upload_permanent_failure INT DEFAULT(0);");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN compressed_blob_upload_timestamp INT DEFAULT(0);");
                        break;
                    case 29060:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN storage_uri TEXT;");
                        break;
                    case 30040:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN media_encryption_key BLOB;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN compressed_media_encryption_key BLOB;");
                        break;
                    case 40040:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN cms_full_size_blob_id TEXT;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN cms_compressed_blob_id TEXT;");
                        break;
                    case 42010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN cms_media_encryption_key BLOB;");
                        break;
                    case 42070:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN cms_compressed_media_encryption_key BLOB;");
                        break;
                    case 44010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN cms_attachment_processing_status INT DEFAULT(0);");
                        break;
                    case 49010:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN attachment_upload_response BLOB;");
                        break;
                    case 52030:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN missing_entry_in_telephony INT;");
                        break;
                    case 52050:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN file_size_bytes INT;");
                        dtveVar.y("ALTER TABLE parts ADD COLUMN local_cache_path TEXT;");
                        break;
                    case 53040:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN awaiting_reverse_sync INT DEFAULT(0);");
                        break;
                    case 58150:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN media_send_type INT DEFAULT(0);");
                        break;
                    case 58380:
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_content_type");
                        dtveVar.y("CREATE INDEX index_parts_content_type ON parts(content_type);");
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_output_uri");
                        dtveVar.y("CREATE INDEX index_parts_output_uri ON parts(output_uri) WHERE output_uri NOT NULL;");
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_conversation_id");
                        dtveVar.y("CREATE INDEX index_parts_conversation_id ON parts(conversation_id);");
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_preview_content_type");
                        dtveVar.y("CREATE INDEX index_parts_preview_content_type ON parts(preview_content_type) WHERE preview_content_type NOT NULL;");
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_file_size_bytes");
                        dtveVar.y("CREATE INDEX index_parts_file_size_bytes ON parts(file_size_bytes) WHERE file_size_bytes <> 0;");
                        dtveVar.y("DROP INDEX IF EXISTS index_parts_local_cache_path");
                        dtveVar.y("CREATE INDEX index_parts_local_cache_path ON parts(local_cache_path) WHERE local_cache_path NOT NULL;");
                        break;
                    case 58770:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN validation_status INT DEFAULT(0);");
                        break;
                    case 59470:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN voice_metadata BLOB;");
                        break;
                    case 59570:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN blob_gaia_email TEXT;");
                        break;
                    case 60080:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN processing_id TEXT;");
                        break;
                    case 60230:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN rich_card_media_download_failure_reason INT DEFAULT(0);");
                        break;
                    case 60240:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN image_display_state INT DEFAULT(0);");
                        break;
                    case 60680:
                        dtveVar.y("ALTER TABLE parts ADD COLUMN preserve_size INT DEFAULT(0);");
                        break;
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
