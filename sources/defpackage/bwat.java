package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwat {
    public final bwau A;
    public final bwau B;
    public final bwau C;
    public final bwau D;
    public final bwau E;
    public final bwau F;
    public final bwau G;
    public final bwau H;
    public final bwau I;
    public final bwau J;
    public final bwau K;
    public final bwau L;
    public final bwau M;
    public final bwau N;
    public final bwau O;
    public final bwau P;
    public final bwau Q;
    public final bwau R;
    public final bwau S;
    public final bwau T;
    public final bwau U;
    public final bwau V;
    public final bwau W;
    public final bwau X;
    public final bwau Y;
    public final bwau Z;
    public final bwau a;
    final bwau[] aa;
    public final bwau b;
    public final bwau c;
    public final bwau d;
    public final bwau e;
    public final bwau f;
    public final bwau g;
    public final bwau h;
    public final bwau i;
    public final bwau j;
    public final bwau k;
    public final bwau l;
    public final bwau m;
    public final bwau n;
    public final bwau o;
    public final bwau p;
    public final bwau q;
    public final bwau r;
    public final bwau s;
    public final bwau t;
    public final bwau u;
    public final bwau v;
    public final bwau w;
    public final bwau x;
    public final bwau y;
    public final bwau z;

    public bwat() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 2;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "parts._id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: bvwr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bvxf
        };
        bwau bwauVar = new bwau(m.a());
        this.a = bwauVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: bvxr
            @Override // java.util.function.Supplier
            public final Object get() {
                return MessagesTable.c.a;
            }
        };
        dtqsVar2.a = "parts.message_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: bvyd
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bvyq
        };
        bwau bwauVar2 = new bwau(m2.a());
        this.b = bwauVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "parts.text";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: bvzc
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bvzo
        };
        bwau bwauVar3 = new bwau(m3.a());
        this.c = bwauVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 4;
        dtqsVar4.a = "parts.uri";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: bwaa
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: bwam
        };
        bwau bwauVar4 = new bwau(m4.a());
        this.d = bwauVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 4;
        m5.d(true);
        dtqsVar5.a = "parts.content_type";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: bvwx
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: bvzw
        };
        bwau bwauVar5 = new bwau(m5.a());
        this.e = bwauVar5;
        dtsb m6 = dtsd.m();
        dtqs dtqsVar6 = (dtqs) m6;
        dtqsVar6.e = 4;
        dtqsVar6.a = "parts.original_uri";
        m6.i(10021);
        dtqsVar6.d = new Supplier() { // from class: bwah
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar6.c = new dtsc() { // from class: bwas
        };
        bwau bwauVar6 = new bwau(m6.a());
        this.f = bwauVar6;
        dtsb m7 = dtsd.m();
        dtqs dtqsVar7 = (dtqs) m7;
        dtqsVar7.e = 4;
        dtqsVar7.a = "parts.storage_uri";
        m7.i(29060);
        dtqsVar7.d = new Supplier() { // from class: bvwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar7.c = new dtsc() { // from class: bvwz
        };
        bwau bwauVar7 = new bwau(m7.a());
        this.g = bwauVar7;
        dtsb m8 = dtsd.m();
        dtqs dtqsVar8 = (dtqs) m8;
        dtqsVar8.e = 1;
        dtqsVar8.a = "parts.width";
        m8.i(-1);
        dtqsVar8.d = new Supplier() { // from class: bvxa
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar8.c = new dtsc() { // from class: bvxb
        };
        bwau bwauVar8 = new bwau(m8.a());
        this.h = bwauVar8;
        dtsb m9 = dtsd.m();
        dtqs dtqsVar9 = (dtqs) m9;
        dtqsVar9.e = 1;
        dtqsVar9.a = "parts.height";
        m9.i(-1);
        dtqsVar9.d = new Supplier() { // from class: bvxc
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar9.c = new dtsc() { // from class: bvxd
        };
        bwau bwauVar9 = new bwau(m9.a());
        this.i = bwauVar9;
        dtsb m10 = dtsd.m();
        dtqs dtqsVar10 = (dtqs) m10;
        dtqsVar10.e = 1;
        dtqsVar10.a = "parts.timestamp";
        m10.i(3010);
        dtqsVar10.d = new Supplier() { // from class: bvxe
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar10.c = new dtsc() { // from class: bvxg
        };
        bwau bwauVar10 = new bwau(m10.a());
        this.j = bwauVar10;
        dtsb m11 = dtsd.m();
        dtqs dtqsVar11 = (dtqs) m11;
        dtqsVar11.e = 4;
        m11.d(true);
        dtqsVar11.a = "parts.output_uri";
        m11.i(4020);
        dtqsVar11.d = new Supplier() { // from class: bvxh
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar11.c = new dtsc() { // from class: bvxj
        };
        bwau bwauVar11 = new bwau(m11.a());
        this.k = bwauVar11;
        dtsb m12 = dtsd.m();
        dtqs dtqsVar12 = (dtqs) m12;
        dtqsVar12.e = 1;
        dtqsVar12.a = "parts.target_size";
        m12.i(4020);
        dtqsVar12.d = new Supplier() { // from class: bvxk
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar12.c = new dtsc() { // from class: bvxl
        };
        bwau bwauVar12 = new bwau(m12.a());
        this.l = bwauVar12;
        dtsb m13 = dtsd.m();
        dtqs dtqsVar13 = (dtqs) m13;
        dtqsVar13.e = 1;
        dtqsVar13.a = "parts.processing_status";
        m13.i(4020);
        dtqsVar13.d = new Supplier() { // from class: bvxm
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar13.c = new dtsc() { // from class: bvxn
        };
        bwau bwauVar13 = new bwau(m13.a());
        this.m = bwauVar13;
        dtsb m14 = dtsd.m();
        dtqs dtqsVar14 = (dtqs) m14;
        dtqsVar14.e = 1;
        dtqsVar14.a = "parts.cms_attachment_processing_status";
        m14.i(44010);
        dtqsVar14.d = new Supplier() { // from class: bvxo
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar14.c = new dtsc() { // from class: bvxp
        };
        bwau bwauVar14 = new bwau(m14.a());
        this.n = bwauVar14;
        dtsb m15 = dtsd.m();
        dtqs dtqsVar15 = (dtqs) m15;
        dtqsVar15.e = 1;
        m15.k(true);
        m15.d(true);
        m15.e(true);
        dtqsVar15.b = new Supplier() { // from class: bvxq
            @Override // java.util.function.Supplier
            public final Object get() {
                return bsom.c.a;
            }
        };
        dtqsVar15.a = "parts.conversation_id";
        m15.i(-1);
        dtqsVar15.d = new Supplier() { // from class: bvxs
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar15.c = new dtsc() { // from class: bvxu
        };
        bwau bwauVar15 = new bwau(m15.a());
        this.o = bwauVar15;
        dtsb m16 = dtsd.m();
        dtqs dtqsVar16 = (dtqs) m16;
        dtqsVar16.e = 1;
        dtqsVar16.a = "parts.sticker_set_id";
        m16.i(5020);
        dtqsVar16.d = new Supplier() { // from class: bvxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar16.c = new dtsc() { // from class: bvxw
        };
        bwau bwauVar16 = new bwau(m16.a());
        this.p = bwauVar16;
        dtsb m17 = dtsd.m();
        dtqs dtqsVar17 = (dtqs) m17;
        dtqsVar17.e = 1;
        dtqsVar17.a = "parts.sticker_id";
        m17.i(5020);
        dtqsVar17.d = new Supplier() { // from class: bvxx
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar17.c = new dtsc() { // from class: bvxy
        };
        bwau bwauVar17 = new bwau(m17.a());
        this.q = bwauVar17;
        dtsb m18 = dtsd.m();
        dtqs dtqsVar18 = (dtqs) m18;
        dtqsVar18.e = 1;
        dtqsVar18.a = "parts.media_modified_timestamp";
        m18.i(7000);
        dtqsVar18.d = new Supplier() { // from class: bvxz
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar18.c = new dtsc() { // from class: bvya
        };
        bwau bwauVar18 = new bwau(m18.a());
        this.r = bwauVar18;
        dtsb m19 = dtsd.m();
        dtqs dtqsVar19 = (dtqs) m19;
        dtqsVar19.e = 3;
        dtqsVar19.a = "parts.longitude";
        m19.i(10005);
        dtqsVar19.d = new Supplier() { // from class: bvyb
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar19.c = new dtsc() { // from class: bvyc
        };
        bwau bwauVar19 = new bwau(m19.a());
        this.s = bwauVar19;
        dtsb m20 = dtsd.m();
        dtqs dtqsVar20 = (dtqs) m20;
        dtqsVar20.e = 3;
        dtqsVar20.a = "parts.latitude";
        m20.i(10005);
        dtqsVar20.d = new Supplier() { // from class: bvyf
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar20.c = new dtsc() { // from class: bvyg
        };
        bwau bwauVar20 = new bwau(m20.a());
        this.t = bwauVar20;
        dtsb m21 = dtsd.m();
        dtqs dtqsVar21 = (dtqs) m21;
        dtqsVar21.e = 4;
        dtqsVar21.a = "parts.preview_content_uri";
        m21.i(10017);
        dtqsVar21.d = new Supplier() { // from class: bvyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar21.c = new dtsc() { // from class: bvyi
        };
        bwau bwauVar21 = new bwau(m21.a());
        this.u = bwauVar21;
        dtsb m22 = dtsd.m();
        dtqs dtqsVar22 = (dtqs) m22;
        dtqsVar22.e = 4;
        m22.d(true);
        dtqsVar22.a = "parts.preview_content_type";
        m22.i(10017);
        dtqsVar22.d = new Supplier() { // from class: bvyj
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar22.c = new dtsc() { // from class: bvyk
        };
        bwau bwauVar22 = new bwau(m22.a());
        this.v = bwauVar22;
        dtsb m23 = dtsd.m();
        dtqs dtqsVar23 = (dtqs) m23;
        dtqsVar23.e = 4;
        dtqsVar23.a = "parts.fallback_uri";
        m23.i(13000);
        dtqsVar23.d = new Supplier() { // from class: bvyl
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar23.c = new dtsc() { // from class: bvym
        };
        bwau bwauVar23 = new bwau(m23.a());
        this.w = bwauVar23;
        dtsb m24 = dtsd.m();
        dtqs dtqsVar24 = (dtqs) m24;
        dtqsVar24.e = 1;
        dtqsVar24.a = "parts.source";
        m24.i(14010);
        dtqsVar24.d = new Supplier() { // from class: bvyn
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar24.c = new dtsc() { // from class: bvyo
        };
        bwau bwauVar24 = new bwau(m24.a());
        this.x = bwauVar24;
        dtsb m25 = dtsd.m();
        dtqs dtqsVar25 = (dtqs) m25;
        dtqsVar25.e = 1;
        dtqsVar25.a = "parts.bundle_index";
        m25.i(17010);
        dtqsVar25.d = new Supplier() { // from class: bvyr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar25.c = new dtsc() { // from class: bvys
        };
        bwau bwauVar25 = new bwau(m25.a());
        this.y = bwauVar25;
        dtsb m26 = dtsd.m();
        dtqs dtqsVar26 = (dtqs) m26;
        dtqsVar26.e = 4;
        dtqsVar26.a = "parts.blob_id";
        m26.i(17020);
        dtqsVar26.d = new Supplier() { // from class: bvyt
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar26.c = new dtsc() { // from class: bvyu
        };
        bwau bwauVar26 = new bwau(m26.a());
        this.z = bwauVar26;
        dtsb m27 = dtsd.m();
        dtqs dtqsVar27 = (dtqs) m27;
        dtqsVar27.e = 4;
        dtqsVar27.a = "parts.blob_gaia_email";
        m27.i(59570);
        dtqsVar27.d = new Supplier() { // from class: bvyv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar27.c = new dtsc() { // from class: bvyw
        };
        bwau bwauVar27 = new bwau(m27.a());
        this.A = bwauVar27;
        dtsb m28 = dtsd.m();
        dtqs dtqsVar28 = (dtqs) m28;
        dtqsVar28.e = 4;
        dtqsVar28.a = "parts.cms_full_size_blob_id";
        m28.i(40040);
        dtqsVar28.d = new Supplier() { // from class: bvyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar28.c = new dtsc() { // from class: bvyy
        };
        bwau bwauVar28 = new bwau(m28.a());
        this.B = bwauVar28;
        dtsb m29 = dtsd.m();
        dtqs dtqsVar29 = (dtqs) m29;
        dtqsVar29.e = 5;
        dtqsVar29.a = "parts.cms_media_encryption_key";
        m29.i(42010);
        dtqsVar29.d = new Supplier() { // from class: bvyz
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar29.c = new dtsc() { // from class: bvzb
        };
        bwau bwauVar29 = new bwau(m29.a());
        this.C = bwauVar29;
        dtsb m30 = dtsd.m();
        dtqs dtqsVar30 = (dtqs) m30;
        dtqsVar30.e = 5;
        dtqsVar30.a = "parts.cms_compressed_media_encryption_key";
        m30.i(42070);
        dtqsVar30.d = new Supplier() { // from class: bvzd
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar30.c = new dtsc() { // from class: bvze
        };
        bwau bwauVar30 = new bwau(m30.a());
        this.D = bwauVar30;
        dtsb m31 = dtsd.m();
        dtqs dtqsVar31 = (dtqs) m31;
        dtqsVar31.e = 1;
        dtqsVar31.a = "parts.blob_upload_permanent_failure";
        m31.i(18000);
        dtqsVar31.d = new Supplier() { // from class: bvzf
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar31.c = new dtsc() { // from class: bvzg
        };
        bwau bwauVar31 = new bwau(m31.a());
        this.E = bwauVar31;
        dtsb m32 = dtsd.m();
        dtqs dtqsVar32 = (dtqs) m32;
        dtqsVar32.e = 1;
        dtqsVar32.a = "parts.blob_upload_timestamp";
        m32.i(19030);
        dtqsVar32.d = new Supplier() { // from class: bvzh
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar32.c = new dtsc() { // from class: bvzi
        };
        bwau bwauVar32 = new bwau(m32.a());
        this.F = bwauVar32;
        dtsb m33 = dtsd.m();
        dtqs dtqsVar33 = (dtqs) m33;
        dtqsVar33.e = 4;
        dtqsVar33.a = "parts.expressive_sticker_name";
        m33.i(22060);
        dtqsVar33.d = new Supplier() { // from class: bvzj
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar33.c = new dtsc() { // from class: bvzk
        };
        bwau bwauVar33 = new bwau(m33.a());
        this.G = bwauVar33;
        dtsb m34 = dtsd.m();
        dtqs dtqsVar34 = (dtqs) m34;
        dtqsVar34.e = 4;
        dtqsVar34.a = "parts.file_name";
        m34.i(26000);
        dtqsVar34.d = new Supplier() { // from class: bvzm
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar34.c = new dtsc() { // from class: bvzn
        };
        bwau bwauVar34 = new bwau(m34.a());
        this.H = bwauVar34;
        dtsb m35 = dtsd.m();
        dtqs dtqsVar35 = (dtqs) m35;
        dtqsVar35.e = 1;
        dtqsVar35.a = "parts.duration";
        m35.i(26040);
        dtqsVar35.d = new Supplier() { // from class: bvzp
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar35.c = new dtsc() { // from class: bvzq
        };
        bwau bwauVar35 = new bwau(m35.a());
        this.I = bwauVar35;
        dtsb m36 = dtsd.m();
        dtqs dtqsVar36 = (dtqs) m36;
        dtqsVar36.e = 4;
        dtqsVar36.a = "parts.compressed_blob_id";
        m36.i(27000);
        dtqsVar36.d = new Supplier() { // from class: bvzr
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar36.c = new dtsc() { // from class: bvzs
        };
        bwau bwauVar36 = new bwau(m36.a());
        this.J = bwauVar36;
        dtsb m37 = dtsd.m();
        dtqs dtqsVar37 = (dtqs) m37;
        dtqsVar37.e = 4;
        dtqsVar37.a = "parts.cms_compressed_blob_id";
        m37.i(40040);
        dtqsVar37.d = new Supplier() { // from class: bvzt
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar37.c = new dtsc() { // from class: bvzu
        };
        bwau bwauVar37 = new bwau(m37.a());
        this.K = bwauVar37;
        dtsb m38 = dtsd.m();
        dtqs dtqsVar38 = (dtqs) m38;
        dtqsVar38.e = 1;
        dtqsVar38.a = "parts.compressed_blob_upload_permanent_failure";
        m38.i(27000);
        dtqsVar38.d = new Supplier() { // from class: bvzv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar38.c = new dtsc() { // from class: bvzx
        };
        bwau bwauVar38 = new bwau(m38.a());
        this.L = bwauVar38;
        dtsb m39 = dtsd.m();
        dtqs dtqsVar39 = (dtqs) m39;
        dtqsVar39.e = 1;
        dtqsVar39.a = "parts.compressed_blob_upload_timestamp";
        m39.i(27000);
        dtqsVar39.d = new Supplier() { // from class: bvzy
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar39.c = new dtsc() { // from class: bvzz
        };
        bwau bwauVar39 = new bwau(m39.a());
        this.M = bwauVar39;
        dtsb m40 = dtsd.m();
        dtqs dtqsVar40 = (dtqs) m40;
        dtqsVar40.e = 5;
        dtqsVar40.a = "parts.media_encryption_key";
        m40.i(30040);
        dtqsVar40.d = new Supplier() { // from class: bwab
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar40.c = new dtsc() { // from class: bwac
        };
        bwau bwauVar40 = new bwau(m40.a());
        this.N = bwauVar40;
        dtsb m41 = dtsd.m();
        dtqs dtqsVar41 = (dtqs) m41;
        dtqsVar41.e = 5;
        dtqsVar41.a = "parts.compressed_media_encryption_key";
        m41.i(30040);
        dtqsVar41.d = new Supplier() { // from class: bwad
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar41.c = new dtsc() { // from class: bwae
        };
        bwau bwauVar41 = new bwau(m41.a());
        this.O = bwauVar41;
        dtsb m42 = dtsd.m();
        dtqs dtqsVar42 = (dtqs) m42;
        dtqsVar42.e = 1;
        dtqsVar42.a = "parts.missing_entry_in_telephony";
        m42.i(52030);
        dtqsVar42.d = new Supplier() { // from class: bwaf
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar42.c = new dtsc() { // from class: bwag
        };
        bwau bwauVar42 = new bwau(m42.a());
        this.P = bwauVar42;
        dtsb m43 = dtsd.m();
        dtqs dtqsVar43 = (dtqs) m43;
        dtqsVar43.e = 1;
        dtqsVar43.a = "parts.awaiting_reverse_sync";
        m43.i(53040);
        dtqsVar43.d = new Supplier() { // from class: bwai
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar43.c = new dtsc() { // from class: bwaj
        };
        bwau bwauVar43 = new bwau(m43.a());
        this.Q = bwauVar43;
        dtsb m44 = dtsd.m();
        dtqs dtqsVar44 = (dtqs) m44;
        dtqsVar44.e = 1;
        dtqsVar44.a = "parts.file_size_bytes";
        m44.i(52050);
        dtqsVar44.d = new Supplier() { // from class: bwak
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar44.c = new dtsc() { // from class: bwal
        };
        bwau bwauVar44 = new bwau(m44.a());
        this.R = bwauVar44;
        dtsb m45 = dtsd.m();
        dtqs dtqsVar45 = (dtqs) m45;
        dtqsVar45.e = 4;
        m45.d(true);
        dtqsVar45.a = "parts.local_cache_path";
        m45.i(52050);
        dtqsVar45.d = new Supplier() { // from class: bwan
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar45.c = new dtsc() { // from class: bwao
        };
        bwau bwauVar45 = new bwau(m45.a());
        this.S = bwauVar45;
        dtsb m46 = dtsd.m();
        dtqs dtqsVar46 = (dtqs) m46;
        dtqsVar46.e = 1;
        dtqsVar46.a = "parts.media_send_type";
        m46.i(58150);
        dtqsVar46.d = new Supplier() { // from class: bwap
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar46.c = new dtsc() { // from class: bwaq
        };
        bwau bwauVar46 = new bwau(m46.a());
        this.T = bwauVar46;
        dtsb m47 = dtsd.m();
        dtqs dtqsVar47 = (dtqs) m47;
        dtqsVar47.e = 5;
        dtqsVar47.a = "parts.voice_metadata";
        m47.i(59470);
        dtqsVar47.d = new Supplier() { // from class: bwar
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar47.c = new dtsc() { // from class: bvws
        };
        bwau bwauVar47 = new bwau(m47.a());
        this.U = bwauVar47;
        dtsb m48 = dtsd.m();
        dtqs dtqsVar48 = (dtqs) m48;
        dtqsVar48.e = 1;
        dtqsVar48.a = "parts.validation_status";
        m48.i(58770);
        dtqsVar48.d = new Supplier() { // from class: bvwt
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar48.c = new dtsc() { // from class: bvwu
        };
        bwau bwauVar48 = new bwau(m48.a());
        this.V = bwauVar48;
        dtsb m49 = dtsd.m();
        dtqs dtqsVar49 = (dtqs) m49;
        dtqsVar49.e = 4;
        dtqsVar49.a = "parts.processing_id";
        m49.i(60080);
        dtqsVar49.d = new Supplier() { // from class: bvwv
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar49.c = new dtsc() { // from class: bvww
        };
        bwau bwauVar49 = new bwau(m49.a());
        this.W = bwauVar49;
        dtsb m50 = dtsd.m();
        dtqs dtqsVar50 = (dtqs) m50;
        dtqsVar50.e = 1;
        dtqsVar50.a = "parts.rich_card_media_download_failure_reason";
        m50.i(60230);
        dtqsVar50.d = new Supplier() { // from class: bvxi
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar50.c = new dtsc() { // from class: bvxt
        };
        bwau bwauVar50 = new bwau(m50.a());
        this.X = bwauVar50;
        dtsb m51 = dtsd.m();
        dtqs dtqsVar51 = (dtqs) m51;
        dtqsVar51.e = 1;
        dtqsVar51.a = "parts.image_display_state";
        m51.i(60240);
        dtqsVar51.d = new Supplier() { // from class: bvye
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar51.c = new dtsc() { // from class: bvyp
        };
        bwau bwauVar51 = new bwau(m51.a());
        this.Y = bwauVar51;
        dtsb m52 = dtsd.m();
        dtqs dtqsVar52 = (dtqs) m52;
        dtqsVar52.e = 1;
        dtqsVar52.a = "parts.preserve_size";
        m52.i(60680);
        dtqsVar52.d = new Supplier() { // from class: bvza
            @Override // java.util.function.Supplier
            public final Object get() {
                return PartsTable.d();
            }
        };
        dtqsVar52.c = new dtsc() { // from class: bvzl
        };
        bwau bwauVar52 = new bwau(m52.a());
        this.Z = bwauVar52;
        this.aa = new bwau[]{bwauVar, bwauVar2, bwauVar3, bwauVar4, bwauVar5, bwauVar6, bwauVar7, bwauVar8, bwauVar9, bwauVar10, bwauVar11, bwauVar12, bwauVar13, bwauVar14, bwauVar15, bwauVar16, bwauVar17, bwauVar18, bwauVar19, bwauVar20, bwauVar21, bwauVar22, bwauVar23, bwauVar24, bwauVar25, bwauVar26, bwauVar27, bwauVar28, bwauVar29, bwauVar30, bwauVar31, bwauVar32, bwauVar33, bwauVar34, bwauVar35, bwauVar36, bwauVar37, bwauVar38, bwauVar39, bwauVar40, bwauVar41, bwauVar42, bwauVar43, bwauVar44, bwauVar45, bwauVar46, bwauVar47, bwauVar48, bwauVar49, bwauVar50, bwauVar51, bwauVar52};
    }
}
