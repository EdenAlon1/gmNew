package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqh implements eknz {
    final /* synthetic */ ekoa a;
    final /* synthetic */ czqi b;

    public czqh(ekoa ekoaVar, czqi czqiVar) {
        this.a = ekoaVar;
        this.b = czqiVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emxc.i(null);
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        Uri uri;
        Parcelable parcelableExtra3;
        Object parcelableExtra4;
        Intent intent = this.a.a;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            ((ensz) czqi.a.h()).q("intent data is null");
            avjf avjfVar = (avjf) this.b.d.b();
            Intent intent2 = this.a.a;
            if (intent2 != null) {
                if (Build.VERSION.SDK_INT > 33) {
                    parcelableExtra4 = intent2.getParcelableExtra("android.intent.extra.REFERRER", Uri.class);
                    parcelableExtra3 = (Parcelable) parcelableExtra4;
                } else {
                    parcelableExtra3 = intent2.getParcelableExtra("android.intent.extra.REFERRER");
                }
                uri = (Uri) parcelableExtra3;
            } else {
                uri = null;
            }
            avjfVar.m(2, null, null, String.valueOf(uri));
            return fgfz.b(this.b.c, ekxi.a(ffhe.a), ffsm.a, new czqd(null));
        }
        ekoa ekoaVar = this.a;
        ((ensz) czqi.a.h()).t("Open SMS deep link intent: %s", data);
        if (!((asmu) this.b.f.b()).a() || ffkj.e(data.getScheme(), "smsto")) {
            czqi czqiVar = this.b;
            return fgfz.b(czqiVar.c, ekxi.a(ffhe.a), ffsm.a, new czqe(null, czqiVar, data));
        }
        Intent intent3 = ekoaVar.a;
        if (ffkj.e(data.getScheme(), "sms") || ffkj.e(data.getScheme(), "smsto")) {
            czqi czqiVar2 = this.b;
            return fgfz.b(czqiVar2.c, ekxi.a(ffhe.a), ffsm.a, new czqf(null, czqiVar2, intent3));
        }
        ((ensz) czqi.a.h()).q("SMS deep link format error!");
        avjf avjfVar2 = (avjf) this.b.d.b();
        String scheme = data.getScheme();
        intent3.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent3.getParcelableExtra("android.intent.extra.REFERRER", Uri.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent3.getParcelableExtra("android.intent.extra.REFERRER");
        }
        avjfVar2.m(2, null, scheme, String.valueOf(parcelableExtra));
        return fgfz.b(this.b.c, ekxi.a(ffhe.a), ffsm.a, new czqg(null));
    }

    @Override // defpackage.eknz
    public final /* synthetic */ eknx e() {
        return ekny.a();
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void d() {
    }
}
