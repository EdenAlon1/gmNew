package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boev {
    public final boew a;

    public boev() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: boar
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar.a = "parts.message_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bobj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bobw
        };
        m.a();
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 2;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "parts._id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: boci
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bocu
        };
        this.a = new boew(m2.a());
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "parts.text";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bodg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bods
        };
        m3.a();
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "parts.uri";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: boee
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: boeq
        };
        m4.a();
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.d(true);
        dtqsVar5.a = "parts.content_type";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: boaz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: boeu
        };
        m5.a();
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "parts.original_uri";
        m6.i(10021);
        dtqsVar6.d = new Supplier() { // from class: boba
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bobb
        };
        m6.a();
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "parts.storage_uri";
        m7.i(29060);
        dtqsVar7.d = new Supplier() { // from class: bobc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bobd
        };
        m7.a();
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "parts.width";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bobe
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bobf
        };
        m8.a();
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "parts.height";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bobg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bobh
        };
        m9.a();
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "parts.timestamp";
        m10.i(3010);
        dtqsVar10.d = new Supplier() { // from class: bobi
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bobl
        };
        m10.a();
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        m11.d(true);
        dtqsVar11.a = "parts.output_uri";
        m11.i(4020);
        dtqsVar11.d = new Supplier() { // from class: bobm
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bobn
        };
        m11.a();
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "parts.target_size";
        m12.i(4020);
        dtqsVar12.d = new Supplier() { // from class: bobo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bobp
        };
        m12.a();
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        dtqsVar13.a = "parts.processing_status";
        m13.i(4020);
        dtqsVar13.d = new Supplier() { // from class: bobq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bobr
        };
        m13.a();
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        dtqsVar14.a = "parts.cms_attachment_processing_status";
        m14.i(44010);
        dtqsVar14.d = new Supplier() { // from class: bobs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bobt
        };
        m14.a();
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 1;
        m15.k(true);
        m15.d(true);
        m15.e(true);
        dtqsVar15.b = new Supplier() { // from class: bobu
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar15.a = "parts.conversation_id";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: bobx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: boby
        };
        m15.a();
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "parts.sticker_set_id";
        m16.i(5020);
        dtqsVar16.d = new Supplier() { // from class: bobz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: boca
        };
        m16.a();
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "parts.sticker_id";
        m17.i(5020);
        dtqsVar17.d = new Supplier() { // from class: bocb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bocc
        };
        m17.a();
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "parts.media_modified_timestamp";
        m18.i(7000);
        dtqsVar18.d = new Supplier() { // from class: bocd
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: boce
        };
        m18.a();
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 3;
        dtqsVar19.a = "parts.longitude";
        m19.i(10005);
        dtqsVar19.d = new Supplier() { // from class: bocf
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: boch
        };
        m19.a();
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 3;
        dtqsVar20.a = "parts.latitude";
        m20.i(10005);
        dtqsVar20.d = new Supplier() { // from class: bocj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bock
        };
        m20.a();
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 4;
        dtqsVar21.a = "parts.preview_content_uri";
        m21.i(10017);
        dtqsVar21.d = new Supplier() { // from class: bocl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bocm
        };
        m21.a();
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 4;
        m22.d(true);
        dtqsVar22.a = "parts.preview_content_type";
        m22.i(10017);
        dtqsVar22.d = new Supplier() { // from class: bocn
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: boco
        };
        m22.a();
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "parts.fallback_uri";
        m23.i(13000);
        dtqsVar23.d = new Supplier() { // from class: bocp
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bocq
        };
        m23.a();
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "parts.source";
        m24.i(14010);
        dtqsVar24.d = new Supplier() { // from class: bocs
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: boct
        };
        m24.a();
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        dtqsVar25.a = "parts.bundle_index";
        m25.i(17010);
        dtqsVar25.d = new Supplier() { // from class: bocv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bocw
        };
        m25.a();
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        dtqsVar26.a = "parts.blob_id";
        m26.i(17020);
        dtqsVar26.d = new Supplier() { // from class: bocx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bocy
        };
        m26.a();
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "parts.blob_gaia_email";
        m27.i(59570);
        dtqsVar27.d = new Supplier() { // from class: bocz
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: boda
        };
        m27.a();
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "parts.cms_full_size_blob_id";
        m28.i(40040);
        dtqsVar28.d = new Supplier() { // from class: bodb
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bodd
        };
        m28.a();
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 5;
        dtqsVar29.a = "parts.cms_media_encryption_key";
        m29.i(42010);
        dtqsVar29.d = new Supplier() { // from class: bode
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bodf
        };
        m29.a();
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 5;
        dtqsVar30.a = "parts.cms_compressed_media_encryption_key";
        m30.i(42070);
        dtqsVar30.d = new Supplier() { // from class: bodh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bodi
        };
        m30.a();
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "parts.blob_upload_permanent_failure";
        m31.i(18000);
        dtqsVar31.d = new Supplier() { // from class: bodj
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bodk
        };
        m31.a();
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "parts.blob_upload_timestamp";
        m32.i(19030);
        dtqsVar32.d = new Supplier() { // from class: bodl
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bodm
        };
        m32.a();
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        dtqsVar33.a = "parts.expressive_sticker_name";
        m33.i(22060);
        dtqsVar33.d = new Supplier() { // from class: bodo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bodp
        };
        m33.a();
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 4;
        dtqsVar34.a = "parts.file_name";
        m34.i(26000);
        dtqsVar34.d = new Supplier() { // from class: bodq
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bodr
        };
        m34.a();
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "parts.duration";
        m35.i(26040);
        dtqsVar35.d = new Supplier() { // from class: bodt
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bodu
        };
        m35.a();
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        dtqsVar36.a = "parts.compressed_blob_id";
        m36.i(27000);
        dtqsVar36.d = new Supplier() { // from class: bodv
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bodw
        };
        m36.a();
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        dtqsVar37.a = "parts.cms_compressed_blob_id";
        m37.i(40040);
        dtqsVar37.d = new Supplier() { // from class: bodx
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bodz
        };
        m37.a();
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "parts.compressed_blob_upload_permanent_failure";
        m38.i(27000);
        dtqsVar38.d = new Supplier() { // from class: boea
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: boeb
        };
        m38.a();
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "parts.compressed_blob_upload_timestamp";
        m39.i(27000);
        dtqsVar39.d = new Supplier() { // from class: boec
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: boed
        };
        m39.a();
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 5;
        dtqsVar40.a = "parts.media_encryption_key";
        m40.i(30040);
        dtqsVar40.d = new Supplier() { // from class: boef
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: boeg
        };
        m40.a();
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 5;
        dtqsVar41.a = "parts.compressed_media_encryption_key";
        m41.i(30040);
        dtqsVar41.d = new Supplier() { // from class: boeh
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: boei
        };
        m41.a();
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 5;
        dtqsVar42.a = "parts.attachment_upload_response";
        m42.i(49010);
        dtqsVar42.d = new Supplier() { // from class: boek
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: boel
        };
        m42.a();
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "parts.missing_entry_in_telephony";
        m43.i(52030);
        dtqsVar43.d = new Supplier() { // from class: boem
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: boen
        };
        m43.a();
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "parts.awaiting_reverse_sync";
        m44.i(53040);
        dtqsVar44.d = new Supplier() { // from class: boeo
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: boep
        };
        m44.a();
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 1;
        dtqsVar45.a = "parts.file_size_bytes";
        m45.i(52050);
        dtqsVar45.d = new Supplier() { // from class: boer
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: boes
        };
        m45.a();
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 4;
        m46.d(true);
        dtqsVar46.a = "parts.local_cache_path";
        m46.i(52050);
        dtqsVar46.d = new Supplier() { // from class: boet
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: boas
        };
        m46.a();
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 1;
        dtqsVar47.a = "parts.media_send_type";
        m47.i(58150);
        dtqsVar47.d = new Supplier() { // from class: boat
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: boau
        };
        m47.a();
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 5;
        dtqsVar48.a = "parts.voice_metadata";
        m48.i(59470);
        dtqsVar48.d = new Supplier() { // from class: boav
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: boaw
        };
        m48.a();
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 1;
        dtqsVar49.a = "parts.validation_status";
        m49.i(58770);
        dtqsVar49.d = new Supplier() { // from class: boax
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: boay
        };
        m49.a();
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 4;
        dtqsVar50.a = "parts.processing_id";
        m50.i(60080);
        dtqsVar50.d = new Supplier() { // from class: bobk
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bobv
        };
        m50.a();
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        dtqsVar51.a = "parts.rich_card_media_download_failure_reason";
        m51.i(60230);
        dtqsVar51.d = new Supplier() { // from class: bocg
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: bocr
        };
        m51.a();
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        dtqsVar52.a = "parts.image_display_state";
        m52.i(60240);
        dtqsVar52.d = new Supplier() { // from class: bodc
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: bodn
        };
        m52.a();
        dtsb m53 = dtsd.m();
        dtqs dtqsVar53 = (dtqs) m53;
        dtqsVar53.e = 1;
        dtqsVar53.a = "parts.preserve_size";
        m53.i(60680);
        dtqsVar53.d = new Supplier() { // from class: body
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessageWithTextIdsQuery.a();
            }
        };
        dtqsVar53.c = new dtsc() { // from class: boej
        };
        m53.a();
    }
}
