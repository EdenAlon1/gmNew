package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avuv implements avwa {
    public final UrlRequest.Builder a;
    private final Optional b = Optional.empty();

    public avuv(errl errlVar, ffbr ffbrVar, String str, UrlRequest.Callback callback) {
        this.a = ((cqqq) ffbrVar.b()).a().newUrlRequestBuilder(str, callback, errlVar).setTrafficStatsTag(8194);
    }

    @Override // defpackage.avwa
    public final avvz a() {
        this.a.setHttpMethod(((avve) this.b.orElse(avve.GET)).toString());
        UrlRequest build = this.a.build();
        build.getClass();
        return new avus(build);
    }

    @Override // defpackage.avwa
    public final /* bridge */ /* synthetic */ void b(String str) {
        this.a.addHeader("Range", str);
    }

    @Override // defpackage.avwa
    public final /* bridge */ /* synthetic */ void c(enhz enhzVar) {
        Iterable$EL.forEach(enhzVar.u(), new Consumer() { // from class: avuu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                avuv.this.a.addHeader((String) entry.getKey(), (String) entry.getValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
