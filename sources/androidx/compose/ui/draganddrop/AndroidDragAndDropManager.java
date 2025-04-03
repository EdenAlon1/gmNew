package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import defpackage.cmi;
import defpackage.cmj;
import defpackage.ffkx;
import defpackage.hvh;
import defpackage.hvi;
import defpackage.hww;
import defpackage.hwy;
import defpackage.hwz;
import defpackage.hxb;
import defpackage.hxc;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener {
    public final hxb a = new hxb(null);
    public final cmj b = new cmj((byte[]) null);
    public final hvi c = new ivp<hxb>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ hvh d() {
            return AndroidDragAndDropManager.this.a;
        }

        @Override // defpackage.ivp
        public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return AndroidDragAndDropManager.this.a.hashCode();
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        hww hwwVar = new hww(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                hxb hxbVar = this.a;
                ffkx ffkxVar = new ffkx();
                hxc.a(hxbVar, new hwy(ffkxVar));
                boolean z = ffkxVar.a;
                cmi cmiVar = new cmi(this.b);
                while (cmiVar.hasNext()) {
                }
                break;
            case 2:
                this.a.b(hwwVar);
                break;
            case 4:
                hxc.a(this.a, new hwz());
                this.b.clear();
            case 3:
                return false;
            case 6:
                this.a.a(hwwVar);
            case 5:
                return false;
        }
        return false;
    }
}
