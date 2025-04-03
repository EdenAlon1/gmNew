package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrl implements cctr {
    private final cctp a;
    private final axkm c;
    private final ashs d;
    private final ashh e;
    private final ffbr f;

    public ccrl(cctp cctpVar, axkm axkmVar, ashs ashsVar, ashh ashhVar, ffbr ffbrVar) {
        this.a = cctpVar;
        this.c = axkmVar;
        this.d = ashsVar;
        this.e = ashhVar;
        this.f = ffbrVar;
    }

    public static final bqkw c(int i) {
        if (i == ccrk.a(4)) {
            return bqkw.BACKUP_UPDATE_URI;
        }
        if (i == ccrk.a(5)) {
            return bqkw.BACKUP_UPDATE_RARE;
        }
        if (i == ccrk.a(3)) {
            return bqkw.BACKUP_UPDATE_FREQUENT;
        }
        if (i == ccrk.a(6)) {
            return bqkw.BACKUP_UPDATE_ADDITIONAL_FIELDS;
        }
        csjb e = b.e();
        e.I("Failed to parse part operation from flags, returning unknown AbandonedAction");
        e.y("flags", i);
        e.r();
        return bqkw.BACKUP_UNKNOWN_OPERATION;
    }

    private final engw d() {
        final ArrayList arrayList = new ArrayList();
        ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: ccrg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final List list = arrayList;
                Map.EL.forEach((java.util.Map) obj, new BiConsumer() { // from class: ccrh
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        list.addAll(((csdr) obj3).b());
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return engw.n(arrayList);
    }

    private static List e() {
        return enkr.c("sender_id", "message_protocol", "mms_subject", "mms_transaction_id", "mms_expiry", "mms_retrieve_text", "cloud_sync_id", "rcs_message_id_with_text_type", "etouffee_status", "rcs_file_transfer_session_id", "sms_error_code", "correlation_id", "is_hidden", "received_timestamp");
    }

    private static final int f() {
        return !csgj.a() ? ccrk.a(5) : ccue.a(9);
    }

    @Override // defpackage.cctr
    public final List a() {
        if (this.c.al()) {
            bech a = this.a.a(1, becg.UPDATE, ccrk.a(3));
            a.d = engw.s("message_status", "seen");
            a.f = 5;
            a.a = ccrk.b(3);
            String a2 = a.a();
            bech a3 = this.a.a(1, becg.UPDATE, ccrk.a(3));
            a3.b = 1;
            a3.d = enkr.c("read");
            a3.b("NEW.read");
            a3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
            a3.a = "read";
            a3.f = 5;
            String a4 = a3.a();
            bech a5 = this.a.a(1, becg.UPDATE, ccrk.a(5));
            a5.d = e();
            a5.a = ccrk.b(5);
            a5.f = 5;
            String a6 = a5.a();
            bech a7 = this.a.b(5, becg.INSERT).a(1, "message_id");
            a7.g = ccrk.a(5);
            String a8 = a7.a();
            ccto b = this.a.b(5, becg.UPDATE);
            Integer[] b2 = csgg.b();
            int length = b2.length;
            Integer[] numArr = new Integer[length + 1];
            System.arraycopy(b2, 0, numArr, 0, length);
            numArr[length] = Integer.valueOf(csgg.RESTORED_FROM_CMS.ordinal());
            bech b3 = b.b(1, "message_id", numArr);
            b3.d = engw.r(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            b3.g = ccrk.a(4);
            b3.f = 5;
            b3.a = ccrk.b(4);
            String a9 = b3.a();
            bech bechVar = new bech();
            bechVar.c = becg.DELETE;
            bechVar.e = 32;
            bechVar.b = 5;
            bechVar.i = "message_id";
            bechVar.c();
            bechVar.g = f();
            bechVar.h = this.e.a();
            String a10 = bechVar.a();
            bech a11 = this.a.b(4, becg.INSERT).a(1, "message_id");
            a11.g = ccrk.a(5);
            a11.f = 5;
            String a12 = a11.a();
            bech a13 = this.a.b(4, becg.UPDATE).a(1, "message_id");
            a13.g = ccrk.a(5);
            a13.f = 5;
            String a14 = a13.a();
            bech a15 = this.a.b(4, becg.DELETE).a(1, "message_id");
            a15.g = ccrk.a(5);
            a15.f = 5;
            String a16 = a15.a();
            bech a17 = this.a.b(8, becg.INSERT).a(1, "message_id");
            a17.g = ccrk.a(5);
            a17.f = 5;
            String a18 = a17.a();
            bech a19 = this.a.b(8, becg.DELETE).a(1, "message_id");
            a19.g = ccrk.a(5);
            a19.f = 5;
            String a20 = a19.a();
            bech a21 = this.a.b(9, becg.INSERT).a(1, "message_id");
            a21.g = ccrk.a(5);
            a21.f = 5;
            String a22 = a21.a();
            bech a23 = this.a.b(9, becg.DELETE).a(1, "message_id");
            a23.g = ccrk.a(5);
            a23.f = 5;
            String a24 = a23.a();
            bech a25 = this.a.b(9, becg.UPDATE).a(1, "message_id");
            a25.d = engw.s("conversation_suggestion_type", "properties");
            a25.g = ccrk.a(5);
            a25.f = 5;
            ArrayList arrayList = new ArrayList(Arrays.asList(a2, a4, a6, a8, a9, a10, a12, a14, a16, a18, a20, a22, a24, a25.a()));
            if (this.d.a() && csgj.a()) {
                arrayList.addAll(d());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        bech bechVar2 = new bech();
        bechVar2.c = becg.UPDATE;
        bechVar2.e = 32;
        bechVar2.b = 1;
        bechVar2.d = enkr.c("message_status", "seen");
        bechVar2.a = ccrk.b(3);
        bechVar2.f = 5;
        bechVar2.c();
        bechVar2.h = this.e.a();
        bechVar2.g = ccrk.a(3);
        arrayList2.add(bechVar2.a());
        bech bechVar3 = new bech();
        bechVar3.c = becg.UPDATE;
        bechVar3.a = "read";
        bechVar3.e = 32;
        bechVar3.b = 1;
        bechVar3.d = enkr.c("read");
        bechVar3.f = 5;
        bechVar3.c();
        bechVar3.h = this.e.a();
        bechVar3.g = ccrk.a(3);
        bechVar3.b("NEW.read");
        bechVar3.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList2.add(bechVar3.a());
        bech bechVar4 = new bech();
        bechVar4.c = becg.UPDATE;
        bechVar4.e = 32;
        bechVar4.b = 1;
        bechVar4.d = e();
        bechVar4.a = ccrk.b(5);
        bechVar4.f = 5;
        bechVar4.c();
        bechVar4.h = this.e.a();
        bechVar4.g = ccrk.a(5);
        arrayList2.add(bechVar4.a());
        bech bechVar5 = new bech();
        bechVar5.c = becg.INSERT;
        bechVar5.e = 32;
        bechVar5.b = 5;
        bechVar5.i = "message_id";
        bechVar5.c();
        bechVar5.h = this.e.a();
        bechVar5.g = ccrk.a(5);
        arrayList2.add(bechVar5.a());
        bech bechVar6 = new bech();
        bechVar6.c = becg.UPDATE;
        bechVar6.e = 32;
        bechVar6.b = 5;
        bechVar6.d = enkr.c(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        bechVar6.a = ccrk.b(4);
        bechVar6.i = "message_id";
        bechVar6.f = 5;
        bechVar6.c();
        bechVar6.h = this.e.a();
        bechVar6.g = ccrk.a(4);
        arrayList2.add(bechVar6.a());
        bech bechVar7 = new bech();
        bechVar7.c = becg.DELETE;
        bechVar7.e = 32;
        bechVar7.b = 5;
        bechVar7.i = "message_id";
        bechVar7.c();
        bechVar7.h = this.e.a();
        bechVar7.g = f();
        arrayList2.add(bechVar7.a());
        bech bechVar8 = new bech();
        bechVar8.c = becg.INSERT;
        bechVar8.e = 32;
        bechVar8.b = 4;
        bechVar8.f = 5;
        bechVar8.i = "message_id";
        bechVar8.c();
        bechVar8.h = this.e.a();
        bechVar8.g = ccrk.a(5);
        arrayList2.add(bechVar8.a());
        bech bechVar9 = new bech();
        bechVar9.c = becg.UPDATE;
        bechVar9.e = 32;
        bechVar9.b = 4;
        bechVar9.f = 5;
        bechVar9.i = "message_id";
        bechVar9.c();
        bechVar9.h = this.e.a();
        bechVar9.g = ccrk.a(5);
        arrayList2.add(bechVar9.a());
        bech bechVar10 = new bech();
        bechVar10.c = becg.DELETE;
        bechVar10.e = 32;
        bechVar10.b = 4;
        bechVar10.f = 5;
        bechVar10.i = "message_id";
        bechVar10.c();
        bechVar10.h = this.e.a();
        bechVar10.g = ccrk.a(5);
        arrayList2.add(bechVar10.a());
        bech bechVar11 = new bech();
        bechVar11.c = becg.INSERT;
        bechVar11.e = 32;
        bechVar11.b = 8;
        bechVar11.f = 5;
        bechVar11.i = "message_id";
        bechVar11.c();
        bechVar11.h = this.e.a();
        bechVar11.g = ccrk.a(5);
        arrayList2.add(bechVar11.a());
        bech bechVar12 = new bech();
        bechVar12.c = becg.DELETE;
        bechVar12.e = 32;
        bechVar12.b = 8;
        bechVar12.f = 5;
        bechVar12.i = "message_id";
        bechVar12.c();
        bechVar12.h = this.e.a();
        bechVar12.g = ccrk.a(5);
        arrayList2.add(bechVar12.a());
        bech bechVar13 = new bech();
        bechVar13.c = becg.INSERT;
        bechVar13.e = 32;
        bechVar13.b = 9;
        bechVar13.f = 5;
        bechVar13.i = "message_id";
        bechVar13.c();
        bechVar13.h = this.e.a();
        bechVar13.g = ccrk.a(5);
        arrayList2.add(bechVar13.a());
        bech bechVar14 = new bech();
        bechVar14.c = becg.DELETE;
        bechVar14.e = 32;
        bechVar14.b = 9;
        bechVar14.f = 5;
        bechVar14.i = "message_id";
        bechVar14.c();
        bechVar14.h = this.e.a();
        bechVar14.g = ccrk.a(5);
        arrayList2.add(bechVar14.a());
        bech bechVar15 = new bech();
        bechVar15.c = becg.UPDATE;
        bechVar15.e = 32;
        bechVar15.b = 9;
        bechVar15.d = enkr.c("conversation_suggestion_type", "properties");
        bechVar15.f = 5;
        bechVar15.i = "message_id";
        bechVar15.c();
        bechVar15.h = this.e.a();
        bechVar15.g = ccrk.a(5);
        arrayList2.add(bechVar15.a());
        if (this.d.a() && csgj.a()) {
            arrayList2.addAll(d());
        }
        return arrayList2;
    }

    @Override // defpackage.cctr
    public final List b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a.d(1, becg.UPDATE, ccrk.b(3)));
        arrayList.add(this.a.d(1, becg.UPDATE, ccrk.b(5)));
        arrayList.add(this.a.c(5, becg.INSERT));
        arrayList.add(this.a.c(5, becg.DELETE));
        arrayList.add(this.a.d(5, becg.UPDATE, ccrk.b(5)));
        arrayList.add(this.a.c(4, becg.INSERT));
        arrayList.add(this.a.c(4, becg.DELETE));
        arrayList.add(this.a.c(4, becg.UPDATE));
        arrayList.add(this.a.c(8, becg.INSERT));
        arrayList.add(this.a.c(8, becg.DELETE));
        arrayList.add(this.a.c(9, becg.INSERT));
        arrayList.add(this.a.c(9, becg.DELETE));
        arrayList.add(this.a.c(9, becg.UPDATE));
        arrayList.add(this.a.d(5, becg.UPDATE, ccrk.b(4)));
        arrayList.add(this.a.d(1, becg.UPDATE, "read"));
        if (this.d.a() && csgj.a()) {
            final ArrayList arrayList2 = new ArrayList();
            ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: ccri
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    final List list = arrayList2;
                    Map.EL.forEach((java.util.Map) obj, new BiConsumer() { // from class: ccrj
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            list.addAll(((csdr) obj3).c());
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            arrayList.addAll(engw.n(arrayList2));
        }
        return arrayList;
    }
}
