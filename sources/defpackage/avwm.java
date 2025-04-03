package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avwm implements avwq {
    private final djry a;
    private final avwx b;
    private int c = 0;
    private Optional d = Optional.empty();

    public avwm(djry djryVar, avwx avwxVar) {
        this.a = djryVar;
        this.b = avwxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r14v0, types: [avwz] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    @Override // defpackage.avwq
    public final elfl a() {
        String str;
        String str2;
        String str3;
        String str4;
        String a;
        char c;
        char c2 = 2;
        if (this.c >= 2) {
            throw new avws();
        }
        enhv enhvVar = new enhv();
        enhvVar.h("User-Agent", this.b.a());
        try {
            if (this.c > 0) {
                try {
                    InstantMessageConfiguration o = ((djtp) this.a.m().orElseThrow()).o();
                    String str5 = o.mFtHttpContentServerUser;
                    String str6 = o.mFtHttpContentServerPassword;
                    UrlResponseInfo urlResponseInfo = (UrlResponseInfo) this.d.orElseThrow(new Supplier() { // from class: avwl
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new IllegalStateException("Required response info is missing");
                        }
                    });
                    Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                    int i = engw.d;
                    String str7 = (String) Collection.EL.stream((List) Map.EL.getOrDefault(allHeaders, "WWW-Authenticate", enou.a)).findFirst().orElseThrow(new Supplier() { // from class: avwk
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new avwu(String.format("No \"%s\" header found in response", "WWW-Authenticate"));
                        }
                    });
                    ?? r12 = false;
                    String str8 = urlResponseInfo.getUrlChain().get(0);
                    ?? avwzVar = new avwz(str7);
                    avwf avwfVar = new avwf();
                    avwfVar.c("");
                    avwfVar.b("");
                    avwfVar.a("");
                    avwzVar.d();
                    avwfVar.c(avwzVar.a());
                    avwzVar.d();
                    while (!avwzVar.e()) {
                        String a2 = avwzVar.a();
                        avwzVar.d();
                        char c3 = r12;
                        avwzVar.c(avwzVar.b.charAt(avwzVar.c) == '=' ? true : c3);
                        avwzVar.c++;
                        avwzVar.d();
                        switch (a2.hashCode()) {
                            case -1326197564:
                                if (a2.equals("domain")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1010695135:
                                if (a2.equals("opaque")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 112146:
                                if (a2.equals("qop")) {
                                    c = c2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 105002991:
                                if (a2.equals("nonce")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 108386959:
                                if (a2.equals("realm")) {
                                    c = c3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109757337:
                                if (a2.equals("stale")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 225490031:
                                if (a2.equals("algorithm")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                avwfVar.b(avwzVar.b());
                                break;
                            case 1:
                                avwfVar.c = Optional.of(avwzVar.b());
                                break;
                            case 2:
                                avwfVar.d = Optional.of(avwzVar.b());
                                break;
                            case 3:
                                avwfVar.a(avwzVar.b());
                                break;
                            case 4:
                                avwfVar.f = Optional.of(avwzVar.b());
                                break;
                            case 5:
                                avwfVar.g = Optional.of(avwzVar.b());
                                break;
                            case 6:
                                avwzVar.c(avwzVar.b().equals("MD5"));
                                break;
                            default:
                                ((ensz) ((ensz) avwz.a.j()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/authentication/WwwAuthenticateHeader$WwwAuthenticateHeaderParser", "parse", 124, "WwwAuthenticateHeader.java")).t("Unrecognized parameter received while parsing %s header", "WWW-Authenticate");
                                break;
                        }
                        avwzVar.d();
                        if (!avwzVar.e() && avwzVar.b.charAt(avwzVar.c) == ',') {
                            avwzVar.c++;
                            avwzVar.d();
                        }
                        r12 = c3;
                        c2 = 2;
                    }
                    ?? r17 = r12;
                    String str9 = avwfVar.a;
                    if (str9 != null && (str = avwfVar.b) != null && (str2 = avwfVar.e) != null) {
                        avwg avwgVar = new avwg(str9, str, avwfVar.c, avwfVar.d, str2, avwfVar.f, avwfVar.g);
                        if (avwgVar.a.isEmpty()) {
                            throw new avwu("Schema is required");
                        }
                        if (avwgVar.b.isEmpty()) {
                            throw new avwu("Realm is required");
                        }
                        if (avwgVar.d.isEmpty()) {
                            throw new avwu("Nonce is required");
                        }
                        if (!avwgVar.a.equals("Digest")) {
                            String str10 = avwgVar.a;
                            Object[] objArr = new Object[2];
                            objArr[r17 == true ? 1 : 0] = "Digest";
                            objArr[1] = str10;
                            throw new avwu(String.format("Invalid authentication scheme. Expected %s, but got %s", objArr));
                        }
                        String str11 = avwgVar.b;
                        String str12 = (String) avwgVar.c.orElse("");
                        String str13 = avwgVar.d;
                        String uuid = UUID.randomUUID().toString();
                        if (str12.contains("auth-int")) {
                            throw new avwu("Integrity protection (auth-int) is not implemented");
                        }
                        boolean equals = str12.equals("auth");
                        if (equals || str12.isEmpty()) {
                            str3 = str13;
                        } else {
                            str3 = str13;
                            ((ensz) ((ensz) avwj.a.j()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/authentication/DigestHeaderProvider", "createDigestHeaderValueWithResponse", 47, "DigestHeaderProvider.java")).t("Unrecognized qop value received: '%s'", str12);
                        }
                        String a3 = avwj.a(str5, str11, str6);
                        String a4 = avwj.a("GET", str8);
                        if (equals) {
                            str4 = str3;
                            a = avwj.a(a3, str3, "00000001", uuid, str12, a4);
                        } else {
                            str4 = str3;
                            a = avwj.a(a3, str4, a4);
                        }
                        final StringBuilder sb = new StringBuilder("Digest");
                        sb.append(" username=");
                        sb.append(avwj.b(str5));
                        sb.append(", realm=");
                        sb.append(avwj.b(str11));
                        sb.append(", nonce=");
                        sb.append(avwj.b(str4));
                        sb.append(", uri=");
                        sb.append(avwj.b(str8));
                        sb.append(", response=");
                        sb.append(avwj.b(a));
                        if (equals) {
                            sb.append(", qop=auth, nc=00000001, cnonce=");
                            sb.append(avwj.b(uuid));
                        }
                        avwgVar.e.ifPresent(new Consumer() { // from class: avwi
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                entd entdVar = avwj.a;
                                StringBuilder sb2 = sb;
                                sb2.append(", opaque=");
                                sb2.append(avwj.b((String) obj));
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        enhvVar.h("Authorization", sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (avwfVar.a == null) {
                        sb2.append(" schema");
                    }
                    if (avwfVar.b == null) {
                        sb2.append(" realm");
                    }
                    if (avwfVar.e == null) {
                        sb2.append(" nonce");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                } catch (avwu e) {
                    e = e;
                    avvc g = avvd.g();
                    g.c(e);
                    return elfo.e(new avwc(g.a()));
                }
            }
            this.c++;
            return elfo.e(new avwd(enhvVar.f()));
        } catch (avwu e2) {
            e = e2;
        }
    }

    @Override // defpackage.avwq
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (this.c == 1) {
            this.d = Optional.of(urlResponseInfo);
        }
        return this.c < 2 ? httpStatusCode == 401 : httpStatusCode != 200;
    }
}
