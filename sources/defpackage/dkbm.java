package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkbm {
    public abstract dkbn a();

    public abstract eyyu b();

    public abstract ezez c();

    public abstract Optional d();

    public abstract String e();

    @Deprecated
    public abstract void f(String str);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(ezez ezezVar);

    public final dkbn j() {
        if (((Boolean) djai.t().a.j.a()).booleanValue()) {
            k("rcs_engine_session_id", e());
        }
        final Uri.Builder buildUpon = Uri.parse(((eyzd) b().instance).d).buildUpon();
        Optional d = d();
        buildUpon.getClass();
        d.ifPresent(new Consumer() { // from class: dkbk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                buildUpon.path((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Map.EL.forEach(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((eyzd) b().instance).e)), new BiConsumer() { // from class: dkbl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                Iterator<E> it = ((eyzb) obj2).b.iterator();
                while (it.hasNext()) {
                    buildUpon.appendQueryParameter(str, (String) it.next());
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        String uri = buildUpon.build().toString();
        URL url = new URL(uri);
        if (!url.getProtocol().equals("https")) {
            if (!url.getProtocol().equals("http")) {
                dkty.g("Error converting url to secure link when building ProvisioningHttpRequest", new Object[0]);
                throw new MalformedURLException("Only HTTPS or HTTP protocols are allowed in the URL");
            }
            if (!((Boolean) dint.e.a()).booleanValue() && !c().equals(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE)) {
                uri = uri.replace("http://", "https://");
            }
        }
        f(uri);
        return a();
    }

    public final void k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eyyu b = b();
        eyyw eyywVar = eyyw.a;
        java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((eyzd) b.instance).f);
        if (unmodifiableMap.containsKey(str)) {
            eyywVar = (eyyw) unmodifiableMap.get(str);
        }
        eyyv eyyvVar = (eyyv) eyywVar.toBuilder();
        eyyvVar.copyOnWrite();
        eyyw eyywVar2 = (eyyw) eyyvVar.instance;
        str2.getClass();
        eygr eygrVar = eyywVar2.b;
        if (!eygrVar.c()) {
            eyywVar2.b = eyfy.mutableCopy(eygrVar);
        }
        eyywVar2.b.add(str2);
        eyyw eyywVar3 = (eyyw) eyyvVar.build();
        eyyu b2 = b();
        eyywVar3.getClass();
        b2.copyOnWrite();
        ((eyzd) b2.instance).a().put(str, eyywVar3);
    }

    public final void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        eyyu b = b();
        eyzb eyzbVar = eyzb.a;
        java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((eyzd) b.instance).e);
        if (unmodifiableMap.containsKey(str)) {
            eyzbVar = (eyzb) unmodifiableMap.get(str);
        }
        eyza eyzaVar = (eyza) eyzbVar.toBuilder();
        eyzaVar.a(str2);
        b().a(str, (eyzb) eyzaVar.build());
    }

    public final void m(int i) {
        eyyu b = b();
        b.copyOnWrite();
        eyzd eyzdVar = (eyzd) b.instance;
        eyzd eyzdVar2 = eyzd.a;
        eyzdVar.c = i - 1;
        eyzdVar.b |= 1;
    }
}
