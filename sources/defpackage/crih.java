package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class crih {
    public static final cfup a = cfvl.r(159443725, "use_missing_attachment_view");
    protected final csmj b;
    protected final cuxz c;
    private final elbx d;
    private final crig e = new Object() { // from class: crig
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [crig] */
    protected crih(csmj csmjVar, cuxz cuxzVar, elbx elbxVar) {
        this.b = csmjVar;
        this.c = cuxzVar;
        this.d = elbxVar;
    }

    protected static void c(View view, boolean z) {
        if (view != null) {
            view.setClickable(z);
            view.setImportantForAccessibility(true != z ? 2 : 1);
        }
    }

    private final cric h(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        boolean z = true;
        if (i2 != 7 && i2 != 9) {
            z = false;
        }
        emxf.a(z);
        int e = e(i, i2);
        int d = d(i2);
        View inflate = layoutInflater.inflate(e, viewGroup, false);
        return new cric((crii) inflate.findViewById(d), inflate);
    }

    protected cric a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, PendingAttachmentData pendingAttachmentData) {
        throw null;
    }

    protected abstract cric b(LayoutInflater layoutInflater, MessagePartCoreData messagePartCoreData, ViewGroup viewGroup, int i);

    protected abstract int d(int i);

    protected abstract int e(int i, int i2);

    protected abstract cric f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        if (r1.isClickable() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        if (r0.isClickable() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
    
        if (r0.isClickable() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bd, code lost:
    
        if (r1.isClickable() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cric g(android.view.LayoutInflater r7, final com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r8, android.view.ViewGroup r9, int r10, final defpackage.criy r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crih.g(android.view.LayoutInflater, com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, android.view.ViewGroup, int, criy):cric");
    }
}
