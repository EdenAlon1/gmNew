package defpackage;

import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdz implements wdm {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation/simpicker/SimPickerFragmentPeer");
    public final ConversationIdType b;
    public final wdu c;
    public final bcxo d;
    public final ejwl e;
    public final elbx f;
    public boolean g;
    public final ffbr h;
    public SimPickerView l;
    public final ffbr n;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public int o = 1;
    public bcxr m = bcxo.d();

    public wdz(String str, wdu wduVar, bcxo bcxoVar, ffbr ffbrVar, ffbr ffbrVar2, ejwl ejwlVar, elbx elbxVar) {
        this.h = ffbrVar2;
        this.b = bdgq.b(str);
        this.c = wduVar;
        this.d = bcxoVar;
        this.n = ffbrVar;
        this.e = ejwlVar;
        this.f = elbxVar;
    }

    @Override // defpackage.wdm
    public final void a() {
        int i = this.o;
        if (i == 1 || i == 4) {
            return;
        }
        this.l.H().a(true, new Runnable() { // from class: wdv
            @Override // java.lang.Runnable
            public final void run() {
                wdz.this.o = 1;
            }
        });
        this.o = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdz.b(boolean):void");
    }

    @Override // defpackage.cxra
    public final boolean q() {
        throw null;
    }
}
