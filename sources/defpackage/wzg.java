package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import j$.util.Optional;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzg implements wqq {
    public final Context a;
    public final aigz b;
    public final Optional c;
    private final ffbr d;
    private final ajjc e;
    private final autt f;
    private final cbgh g;
    private final ffxx h;
    private final Set i;

    public wzg(Context context, aawu aawuVar, aigz aigzVar, ffbr ffbrVar, Optional optional, ajjc ajjcVar, autt auttVar, cbgh cbghVar) {
        context.getClass();
        aawuVar.getClass();
        aigzVar.getClass();
        ajjcVar.getClass();
        cbghVar.getClass();
        this.a = context;
        this.b = aigzVar;
        this.d = ffbrVar;
        this.c = optional;
        this.e = ajjcVar;
        this.f = auttVar;
        this.g = cbghVar;
        this.h = new fgch(aawuVar.a(), ((Optional) ffbrVar.b()).isPresent() ? ((wxw) ((Optional) ffbrVar.b()).get()).b : new ffyg(false), new wzf(this, null));
        this.i = fffi.d(aaxf.b, aaxf.c);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.i;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Intent c(alxr alxrVar, Context context) {
        Context context2;
        Uri b;
        String b2 = wzh.b(alxrVar);
        boolean z = false;
        boolean z2 = (b2 == null || ffpc.J(b2)) ? false : true;
        String a = wzh.a(alxrVar);
        if (a != null && !ffpc.J(a)) {
            z = true;
        }
        boolean z3 = alxrVar.g() instanceof apmq;
        boolean z4 = alxrVar.g() instanceof apps;
        if (!z2 && !z && !z3 && !z4) {
            throw new IllegalStateException("Nothing to share!");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        appj g = alxrVar.g();
        if (g instanceof apps) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", ((apps) g).m());
            return intent;
        }
        if (g instanceof apmq) {
            apmq apmqVar = (apmq) g;
            autt auttVar = this.f;
            cbgh cbghVar = this.g;
            boolean a2 = ((ersq) ((autq) auttVar).a.b()).a("bugle.use_file_provider_for_sharing_file_uris");
            boolean z5 = apmqVar instanceof apph;
            if (z5 && !wzh.e((apph) apmqVar)) {
                context2 = context;
                b = null;
            } else if (apmqVar instanceof MediaContentItem) {
                MediaContentItem mediaContentItem = (MediaContentItem) apmqVar;
                if (cbgi.k(mediaContentItem.e(), context) || csuu.z(mediaContentItem.e())) {
                    context2 = context;
                    b = cbgl.b(context2, mediaContentItem.e(), null, mediaContentItem.f(), 0L);
                } else {
                    b = mediaContentItem.e();
                    context2 = context;
                }
            } else {
                context2 = context;
                Uri e = apmqVar.e();
                apph apphVar = z5 ? (apph) apmqVar : null;
                String h = apphVar != null ? apphVar.h() : null;
                String a3 = le.a(apmqVar.b());
                apph apphVar2 = z5 ? (apph) apmqVar : null;
                b = cbgl.b(context2, e, h, a3, apphVar2 != null ? apphVar2.a() : 0L);
            }
            if (a2) {
                if (ffkj.e(b != null ? b.getScheme() : null, "file") && b.getPath() != null) {
                    String str = cbghVar.a;
                    String path = b.getPath();
                    if (path == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    b = FileProvider.a(context2, str, new File(path));
                }
            }
            intent.putExtra("android.intent.extra.STREAM", b);
            intent.setType(alxrVar.g().b());
            String q = alxrVar.q();
            if (q != null) {
                intent.putExtra("android.intent.extra.TEXT", q);
                return intent;
            }
        } else {
            if (!(g instanceof appw)) {
                throw new IllegalArgumentException("Unknown type for share!");
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", wzh.b(alxrVar));
            String a4 = wzh.a(alxrVar);
            if (a4 != null && !ffpc.J(a4)) {
                intent.putExtra("android.intent.extra.SUBJECT", a4);
                intent.putExtra("extra_subject_mandatory", true);
            }
        }
        return intent;
    }

    public final void d(final alxr alxrVar) {
        alxrVar.getClass();
        if (cubs.f()) {
            String b = alxrVar.g().b();
            b.getClass();
            if (ffpc.t(b, "image")) {
                this.c.isPresent();
                if (((appq) alxrVar.g()).n() != 1) {
                    this.e.e(new ffji() { // from class: wzb
                        /* JADX WARN: Type inference failed for: r1v1, types: [abke, java.lang.Object] */
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            final ajiy ajiyVar = (ajiy) obj;
                            ajiyVar.getClass();
                            final wzg wzgVar = wzg.this;
                            ?? r1 = wzgVar.c.get();
                            ffix ffixVar = new ffix() { // from class: wzc
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ajiy.this.a();
                                    return ffcu.a;
                                }
                            };
                            final alxr alxrVar2 = alxrVar;
                            return r1.a(ffixVar, new ffix() { // from class: wzd
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ajiy.this.a();
                                    wzg wzgVar2 = wzgVar;
                                    wzgVar2.b.h(new ainm(wzgVar2.c(alxrVar2, wzgVar2.a)));
                                    return ffcu.a;
                                }
                            });
                        }
                    });
                    return;
                }
            }
        }
        this.b.h(new ainm(c(alxrVar, this.a)));
    }
}
