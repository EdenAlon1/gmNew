package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwyq extends mj {
    public static final mr d = new dwyo();
    public dwzp e;
    private final Context f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dwyq(android.content.Context r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            mb r0 = new mb
            mr r1 = defpackage.dwyq.d
            r0.<init>(r1)
            r0.a = r4
            mc r4 = r0.a()
            r2.<init>(r4)
            r4 = 0
            r2.e = r4
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwyq.<init>(android.content.Context, java.util.concurrent.Executor):void");
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new dwyp(LayoutInflater.from(this.f).inflate(R.layout.mdd_debug_list_item_view, viewGroup, false));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, final int i) {
        dwyp dwypVar = (dwyp) wrVar;
        dwns dwnsVar = (dwns) b(i);
        TextView textView = (TextView) dwypVar.s.findViewById(R.id.group_name);
        TextView textView2 = (TextView) dwypVar.s.findViewById(R.id.locale);
        TextView textView3 = (TextView) dwypVar.s.findViewById(R.id.download_account);
        TextView textView4 = (TextView) dwypVar.s.findViewById(R.id.variant_id);
        TextView textView5 = (TextView) dwypVar.s.findViewById(R.id.build_id);
        LinearLayout linearLayout = (LinearLayout) dwypVar.s.findViewById(R.id.variant_container);
        LinearLayout linearLayout2 = (LinearLayout) dwypVar.s.findViewById(R.id.build_container);
        LinearLayout linearLayout3 = (LinearLayout) dwypVar.s.findViewById(R.id.locale_container);
        TextView textView6 = (TextView) dwypVar.s.findViewById(R.id.download_status);
        TextView textView7 = (TextView) dwypVar.s.findViewById(R.id.version_number);
        TextView textView8 = (TextView) dwypVar.s.findViewById(R.id.file_count);
        emxf.b(((dwnsVar.b & 1) == 0 || dwnsVar.c.isEmpty()) ? false : true, "Invalid Metadata");
        textView.setText(dwnsVar.c);
        linearLayout3.setVisibility(true != dwnsVar.k.isEmpty() ? 0 : 8);
        textView2.setText(dwnsVar.k.toString());
        if ((dwnsVar.b & 4) != 0) {
            textView3.setText(dwnsVar.e);
        } else {
            textView3.setText(R.string.list_item_no_account);
        }
        linearLayout2.setVisibility(dwnsVar.i == 0 ? 8 : 0);
        textView5.setText(String.format(Locale.ENGLISH, "%d", Long.valueOf(dwnsVar.i)));
        linearLayout.setVisibility(true != dwnsVar.j.isEmpty() ? 0 : 8);
        textView4.setText(dwnsVar.j);
        if ((dwnsVar.b & 16) != 0) {
            dwnr b = dwnr.b(dwnsVar.g);
            if (b == null) {
                b = dwnr.UNSPECIFIED;
            }
            int i2 = b.e;
            textView6.setText(i2 != 1 ? i2 != 2 ? "Unspecified" : "Pending" : "Downloaded");
        } else {
            textView6.setText(android.R.string.unknownName);
        }
        if ((dwnsVar.b & 8) != 0) {
            textView7.setText(String.format(Locale.ENGLISH, "%d", Integer.valueOf(dwnsVar.f)));
        } else {
            textView7.setText(android.R.string.unknownName);
        }
        Resources resources = this.f.getResources();
        int size = dwnsVar.h.size();
        textView8.setText(resources.getQuantityString(R.plurals.list_item_file_count, size, Integer.valueOf(size)));
        dwypVar.s.setOnClickListener(new View.OnClickListener() { // from class: dwyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dwyq dwyqVar = dwyq.this;
                dwns dwnsVar2 = (dwns) dwyqVar.b(i);
                dwzp dwzpVar = dwyqVar.e;
                if (dwzpVar != null) {
                    ((enrr) ((enrr) dwzm.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl", "downloadFileGroup", 116, "MddDebugListFragmentActionProviderImpl.java")).t("Downloading File Group %s...", dwnsVar2.c);
                    dwzm dwzmVar = (dwzm) dwzpVar.a;
                    emud emudVar = dwzmVar.f;
                    final dwzf dwzfVar = dwzmVar.g;
                    emudVar.c(emud.a(elfr.k(dwzfVar.b.b(dwnsVar2), new eroh() { // from class: dwzc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            return dwzf.this.a();
                        }
                    }, dwzfVar.a)), dwzmVar.b, "MDD.DEBUG.DOWNLOAD_ACTION");
                }
            }
        });
    }
}
