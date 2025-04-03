package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbow implements dtqq {
    public static final bbow a = new bbow();
    public static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("current_my_identity"), d("current_my_identity_foreign_key")), new ffcf(c("snippet_text"), d("snippet_text")), new ffcf(c("archive_status"), d("archive_status")), new ffcf(c("most_recent_timestamp_ms"), d("cms_most_recent_read_message_timestamp_ms")), new ffcf(c("subject"), d("subject_text")), new ffcf(c("name"), d("name")), new ffcf(c("name_is_automatic"), d("name_is_automatic")), new ffcf(c("has_rbm_participant"), d("has_ea2p_bot_recipient")), new ffcf(c("rcs_group_self_msisdn"), d("rcs_group_self_msisdn")), new ffcf(c("rcs_group_id"), d("rcs_group_id")), new ffcf(c("rcs_conference_uri"), d("rcs_conference_uri")), new ffcf(c("rcs_group_capabilities"), d("rcs_group_capabilities")), new ffcf(c("error_state"), d("error_state")), new ffcf(c("rcs_subject_change_timestamp_ms"), d("rcs_subject_change_timestamp_ms")), new ffcf(c("join_state"), d("join_state")), new ffcf(c("conversation_type"), d("conv_type")), new ffcf(c("send_mode"), d("send_mode")), new ffcf(c("cms_id"), d("cms_id")), new ffcf(c("cms_life_cycle"), d("cms_life_cycle")));

    private bbow() {
    }

    private static final bbno c(String str) {
        dtry[] a2 = bboq.a();
        for (int i = 0; i < 20; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbno) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bskq d(String str) {
        dtry[] a2 = bsnx.a();
        for (int i = 0; i < 77; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bskq) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbov.a;
        bbom bbomVar = new bbom();
        bbomVar.f("clearBackupTable");
        bbomVar.e();
        bbomVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbov.a;
        dtvx dtvxVar = new dtvx("conversations_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbno[] bbnoVarArr = (bbno[]) map.keySet().toArray(new bbno[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbnoVarArr, bbnoVarArr.length));
        bsob e = bsom.e();
        e.r();
        bskq[] bskqVarArr = (bskq[]) map.values().toArray(new bskq[0]);
        e.c((bskq[]) Arrays.copyOf(bskqVarArr, bskqVarArr.length));
        dtvxVar.c = e.b();
        dtvxVar.a().a();
    }
}
