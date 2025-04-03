package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcjj implements dtqq {
    public static final bcjj a = new bcjj();
    public static final Map b = ffew.h(new ffcf(d("_id"), e("_id")), new ffcf(d("my_identity_token_foreign_key"), e("my_identity_token_foreign_key")), new ffcf(d("normalized_destination"), e("normalized_destination")), new ffcf(d("send_destination"), e("send_destination")), new ffcf(d("display_destination"), e("display_destination")), new ffcf(d("first_name"), e("first_name")), new ffcf(d("full_name"), e("full_name")), new ffcf(d("blocked"), e("blocked")), new ffcf(d("participant_type"), e("participant_type")), new ffcf(d("is_spam"), e("is_spam")), new ffcf(d("is_spam_source"), e("is_spam_source")), new ffcf(d("country_code"), e("country_code")), new ffcf(d("color_palette_index"), e("color_palette_index")), new ffcf(d("color_type"), e("color_type")), new ffcf(d("extended_color"), e("extended_color")), new ffcf(d("cms_id"), e("cms_id")), new ffcf(d("cms_life_cycle"), e("cms_life_cycle")));

    private bcjj() {
    }

    public static final bvvn c() {
        bvvn e = ParticipantsTable.e();
        e.r();
        bvth[] bvthVarArr = (bvth[]) b.values().toArray(new bvth[0]);
        e.c((bvth[]) Arrays.copyOf(bvthVarArr, bvthVarArr.length));
        return e;
    }

    private static final bcic d(String str) {
        dtry[] a2 = bcjc.a();
        for (int i = 0; i < 18; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bcic) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bvth e(String str) {
        dtry[] a2 = bvvj.a();
        for (int i = 0; i < 46; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bvth) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bcjh.a;
        bciy bciyVar = new bciy();
        bciyVar.f("clearBackupTable");
        bciyVar.e();
        bciyVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bcjh.a;
        dtvx dtvxVar = new dtvx("participants_backup", "backup");
        dtvxVar.d = 5;
        bcic[] bcicVarArr = (bcic[]) b.keySet().toArray(new bcic[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bcicVarArr, bcicVarArr.length));
        dtvxVar.c = c().b();
        dtvxVar.a().a();
    }
}
