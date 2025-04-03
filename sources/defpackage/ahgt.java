package defpackage;

import android.util.Pair;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgt implements cfzm {
    private final ffbr a;
    private final ffbr b;
    private final afar c;
    private final errl d;

    public ahgt(ffbr ffbrVar, afar afarVar, ffbr ffbrVar2, errl errlVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = afarVar;
        this.d = errlVar;
    }

    public final elfl a() {
        if (!((Boolean) aewg.l.e()).booleanValue()) {
            return elfo.e(new ArrayList());
        }
        final elfl b = ((ahik) this.a.b()).b();
        afar afarVar = this.c;
        ffbr ffbrVar = this.b;
        final elfl b2 = afarVar.b();
        final elfl h = ((cgmf) ffbrVar.b()).h((String) aewg.m.e());
        return elfl.g(elfr.d(b, b2, h).a(new Callable() { // from class: ahgs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder("SortFlagEnabled = ");
                cxkc cxkcVar = (cxkc) erqt.q(elfl.this);
                boolean equals = Boolean.TRUE.equals(erqt.q(b2));
                Optional optional = (Optional) erqt.q(h);
                sb.append(aewg.h());
                sb.append("\nConsentState = ");
                sb.append(cxkcVar.a().name());
                sb.append("\nIsReadyState = ");
                sb.append(equals);
                sb.append("\nReadyThreshold = ");
                sb.append(aewg.b());
                sb.append("\nModelId = ");
                sb.append(aewg.e());
                sb.append("\n");
                if (optional.isPresent()) {
                    sb.append("MddFileGroupStatus = ");
                    dwnr b3 = dwnr.b(((dwns) optional.get()).g);
                    if (b3 == null) {
                        b3 = dwnr.UNSPECIFIED;
                    }
                    sb.append(b3.name());
                    sb.append("\n");
                    for (dwno dwnoVar : ((dwns) optional.get()).h) {
                        sb.append("MddFile: ");
                        sb.append(dwnoVar.c);
                        sb.append(", size: ");
                        sb.append(dwnoVar.e);
                        sb.append("\n");
                    }
                } else {
                    sb.append("MddFileGroupStatus = Not Present\n");
                }
                arrayList.add(new FileTeleporter(sb.toString().getBytes(), "super_sort_psdb"));
                return arrayList;
            }
        }, this.d));
    }

    @Override // defpackage.cfzm
    public final elfl b() {
        return a().h(new emwl() { // from class: ahgr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                StringBuilder sb = new StringBuilder();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    Pair a = ((FileTeleporter) it.next()).a();
                    sb.append("\nSection: ");
                    sb.append((String) a.first);
                    sb.append("\n");
                    sb.append(new String((byte[]) ((Pair) a.second).second, StandardCharsets.UTF_8));
                }
                return sb.toString();
            }
        }, this.d);
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
