package defpackage;

import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwmh implements cfzm {
    static final emyl a = cfvl.y("enable_text_classifier_psbd");
    static final cfva b = cfvl.h(cfvl.b, "text_classifier_mdd_group_name", "text_classifier");
    public static final /* synthetic */ int c = 0;
    private final ffbr d;
    private final errl e;

    public cwmh(ffbr ffbrVar, errl errlVar) {
        this.d = ffbrVar;
        this.e = errlVar;
    }

    public final elfl a() {
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            return ((cgmf) this.d.b()).h((String) b.e()).h(new emwl() { // from class: cwmg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Optional optional = (Optional) obj;
                    int i = cwmh.c;
                    StringBuilder sb = new StringBuilder();
                    if (optional.isPresent()) {
                        sb.append("TextClassifierFileGroupStatus = ");
                        dwnr b2 = dwnr.b(((dwns) optional.get()).g);
                        if (b2 == null) {
                            b2 = dwnr.UNSPECIFIED;
                        }
                        sb.append(b2.name());
                        sb.append("\nVersionNumber = ");
                        sb.append(((dwns) optional.get()).f);
                        sb.append("\n");
                        for (dwno dwnoVar : ((dwns) optional.get()).h) {
                            sb.append("MddFile: ");
                            sb.append(dwnoVar.c);
                            sb.append(", size: ");
                            sb.append(dwnoVar.e);
                            sb.append("\n");
                        }
                    } else {
                        sb.append("TextClassifierFileGroupStatus = Not Present\n");
                    }
                    return engw.r(new FileTeleporter(sb.toString().getBytes(), "text_classifier_psbd"));
                }
            }, this.e);
        }
        int i = engw.d;
        return elfo.e(enou.a);
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return a().h(new emwl() { // from class: cwmf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = cwmh.c;
                StringBuilder sb = new StringBuilder();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Pair a2 = ((FileTeleporter) it.next()).a();
                    sb.append("\nSection: ");
                    sb.append((String) a2.first);
                    sb.append("\n");
                    sb.append(new String((byte[]) ((Pair) a2.second).second, StandardCharsets.UTF_8));
                }
                return sb.toString();
            }
        }, this.e);
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        return a();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl d() {
        return cfzj.d();
    }
}
