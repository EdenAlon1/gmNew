package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbqv implements dtqq {
    public static final bbqv a = new bbqv();
    private static final Map b = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("message_id"), d("message_id")), new ffcf(c("trigger_url"), d("trigger_url")), new ffcf(c("expiration_time_millis"), d("expiration_time_millis")), new ffcf(c("link_title"), d("link_title")), new ffcf(c("link_description"), d("link_description")), new ffcf(c("link_image_url"), d("link_image_url")), new ffcf(c("link_domain"), d("link_domain")), new ffcf(c("link_canonical_url"), d("link_canonical_url")));

    private bbqv() {
    }

    private static final bbpz c(String str) {
        dtry[] a2 = bbqp.a();
        for (int i = 0; i < 9; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbpz) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final btpr d(String str) {
        dtry[] a2 = btqj.a();
        for (int i = 0; i < 11; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (btpr) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        String[] strArr = bbqu.a;
        bbqm bbqmVar = new bbqm();
        bbqmVar.f("clearBackupTable");
        bbqmVar.e();
        bbqmVar.b().b();
    }

    @Override // defpackage.dtqq
    public final void b() {
        String[] strArr = bbqu.a;
        dtvx dtvxVar = new dtvx("link_preview_backup", "backup");
        dtvxVar.d = 5;
        Map map = b;
        bbpz[] bbpzVarArr = (bbpz[]) map.keySet().toArray(new bbpz[0]);
        dtvxVar.b((dtry[]) Arrays.copyOf(bbpzVarArr, bbpzVarArr.length));
        btql b2 = btqq.b();
        b2.r();
        btpr[] btprVarArr = (btpr[]) map.values().toArray(new btpr[0]);
        b2.c((btpr[]) Arrays.copyOf(btprVarArr, btprVarArr.length));
        dtvxVar.c = b2.b();
        dtvxVar.a().a();
    }
}
