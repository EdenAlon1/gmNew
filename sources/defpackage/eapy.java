package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapy extends orr {
    @Override // defpackage.orr
    protected final String a() {
        return "UPDATE OR REPLACE `gnp_accounts` SET `id` = ?,`account_specific_id` = ?,`account_type` = ?,`obfuscated_gaia_id` = ?,`actual_account_name` = ?,`actual_account_oid` = ?,`registration_status` = ?,`registration_id` = ?,`sync_sources` = ?,`representative_target_id` = ?,`sync_version` = ?,`last_registration_time_ms` = ?,`last_registration_request_hash` = ?,`first_registration_version` = ?,`internal_target_id` = ?,`fitbit_decoded_id` = ? WHERE `id` = ?";
    }

    @Override // defpackage.orr
    protected final /* bridge */ /* synthetic */ void b(oxf oxfVar, Object obj) {
        eagt eagtVar = (eagt) obj;
        oxfVar.e(1, eagtVar.e());
        oxfVar.g(2, eagtVar.j());
        oxfVar.e(3, eagtVar.q());
        if (eagtVar.n() == null) {
            oxfVar.f(4);
        } else {
            oxfVar.g(4, eagtVar.n());
        }
        if (eagtVar.k() == null) {
            oxfVar.f(5);
        } else {
            oxfVar.g(5, eagtVar.k());
        }
        if (eagtVar.l() == null) {
            oxfVar.f(6);
        } else {
            oxfVar.g(6, eagtVar.l());
        }
        oxfVar.e(7, eagtVar.b());
        if (eagtVar.o() == null) {
            oxfVar.f(8);
        } else {
            oxfVar.g(8, eagtVar.o());
        }
        oxfVar.g(9, eaoj.b(eagtVar.i()));
        if (eagtVar.p() == null) {
            oxfVar.f(10);
        } else {
            oxfVar.g(10, eagtVar.p());
        }
        oxfVar.e(11, eagtVar.g());
        oxfVar.e(12, eagtVar.f());
        oxfVar.e(13, eagtVar.a());
        oxfVar.e(14, eagtVar.c());
        if (eagtVar.m() == null) {
            oxfVar.f(15);
        } else {
            oxfVar.g(15, eagtVar.m());
        }
        oxfVar.e(16, eagtVar.d());
        oxfVar.e(17, eagtVar.e());
    }
}
