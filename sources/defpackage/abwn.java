package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwn implements ejuh {
    public final errl a;
    public final cqoh b;
    public final Map c;
    public final Bundle d;
    public final AtomicReference e = new AtomicReference(ejug.a);
    private final errl f;

    public abwn(errl errlVar, errl errlVar2, cqoh cqohVar, Map map, Bundle bundle) {
        this.a = errlVar;
        this.f = errlVar2;
        this.b = cqohVar;
        this.c = map;
        this.d = bundle;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#DonationDataSource#LoadData");
        try {
            erph erphVar = new erph(elfo.e((ejug) this.e.get()));
            f.a(erphVar);
            f.close();
            return erphVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#DonationDataSource#FetchAndStoreData");
        try {
            ekzz f2 = eleg.f("DataDonationSource#getDonatableMessages");
            try {
                elfl h = elfo.h(new erog() { // from class: abwm
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        abwn abwnVar = abwn.this;
                        String string = abwnVar.d.getString("EXTRA_COLLECTOR_KEY");
                        emxf.a(!TextUtils.isEmpty(string));
                        abwj abwjVar = (abwj) abwnVar.c.get(string);
                        abwjVar.getClass();
                        return abwjVar.a(abwnVar.d).h(new emwl() { // from class: abwk
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                engw engwVar = (engw) obj;
                                int i = engw.d;
                                engr engrVar = new engr();
                                int size = engwVar.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    engrVar.h(new abzx((abwi) engwVar.get(i2)));
                                }
                                return engw.D(engrVar.g());
                            }
                        }, abwnVar.a);
                    }
                }, this.a);
                f2.b(h);
                f2.close();
                elfl h2 = h.h(new emwl() { // from class: abwl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        if (obj != null) {
                            abwn abwnVar = abwn.this;
                            abwnVar.e.set(ejug.a(obj, abwnVar.b.f()));
                        }
                        return obj;
                    }
                }, this.f);
                f.b(h2);
                f.close();
                return h2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return "DD_DATASOURCE_KEY";
    }
}
