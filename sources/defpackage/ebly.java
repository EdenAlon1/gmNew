package defpackage;

import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebly implements ebny {
    final /* synthetic */ ecau a;

    public ebly(ecau ecauVar) {
        this.a = ecauVar;
    }

    @Override // defpackage.ebny
    public final Runnable a() {
        final ecau ecauVar = this.a;
        return new Runnable() { // from class: eblx
            @Override // java.lang.Runnable
            public final void run() {
                ecau.this.hw();
            }
        };
    }

    @Override // defpackage.ebny
    public final Runnable b() {
        final ecau ecauVar = this.a;
        return new Runnable() { // from class: eblw
            @Override // java.lang.Runnable
            public final void run() {
                efbd.c();
                ExpandableDialogView expandableDialogView = ecau.this.am;
                if (expandableDialogView != null) {
                    View findViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: ecad
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Property property = ecau.ag;
                        }
                    });
                }
            }
        };
    }
}
