package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbtw extends vk {
    public final dbud a;
    public final elbx d;
    public final ffbr e;
    public final Context f;
    public List g;
    private final csrh h;
    private final ffbr i;
    private final String j;
    private final enhk k;

    public dbtw(dbud dbudVar, csrh csrhVar, elbx elbxVar, ffbr ffbrVar, ffbr ffbrVar2, Context context) {
        this.a = dbudVar;
        this.h = csrhVar;
        this.d = elbxVar;
        this.e = ffbrVar;
        this.i = ffbrVar2;
        this.f = context;
        String string = context.getString(R.string.desktop_browser_type_unknown);
        string.getClass();
        this.j = string;
        this.k = enhk.r(eslr.UNKNOWN, string, eslr.OTHER, context.getString(R.string.desktop_browser_type_other), eslr.CHROME, context.getString(R.string.desktop_browser_type_chrome), eslr.FIREFOX, context.getString(R.string.desktop_browser_type_firefox), eslr.SAFARI, context.getString(R.string.desktop_browser_type_safari), eslr.OPERA, context.getString(R.string.desktop_browser_type_opera), eslr.IE, context.getString(R.string.desktop_browser_type_ie), eslr.EDGE, context.getString(R.string.desktop_browser_type_edge));
        this.g = ffel.a;
    }

    private static final eslr m(bzhy bzhyVar) {
        return eslr.b(bzhyVar.e);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gaia_paired_desktop_list_item_view, viewGroup, false);
        inflate.getClass();
        return new dbtv(inflate);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        PorterDuff.Mode mode;
        int i2;
        wrVar.getClass();
        final bzhy bzhyVar = (bzhy) this.g.get(i);
        View view = wrVar.a;
        View findViewById = view.findViewById(R.id.paired_desktop_list_item_name);
        findViewById.getClass();
        TextView textView = (TextView) findViewById;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (bzhyVar.b.length() == 0) {
            String str = (String) this.k.get(m(bzhyVar));
            if (str == null) {
                str = this.j;
            }
            sb2.append(str);
        } else {
            sb2.append(bzhyVar.b);
            if (bzhyVar.c.length() != 0) {
                sb2.append(" ");
                sb2.append(bzhyVar.c);
            }
        }
        sb.append(sb2.toString());
        String str2 = bzhyVar.h;
        if (str2 == null || str2.length() == 0) {
            String str3 = bzhyVar.i;
            if (str3 != null && str3.length() != 0) {
                sb.append(" (");
                sb.append(bzhyVar.i);
                sb.append(")");
            }
        } else {
            sb.append(" (");
            sb.append(bzhyVar.h);
            sb.append(")");
        }
        textView.setText(sb.toString());
        View findViewById2 = view.findViewById(R.id.paired_desktop_list_item_icon);
        findViewById2.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById2;
        String str4 = bzhyVar.k;
        if (str4 == null || str4.length() == 0) {
            if (bzhyVar.d == byyv.SATELLITE) {
                mode = PorterDuff.Mode.MULTIPLY;
                i2 = R.drawable.quantum_ic_tablet_android_white_36;
            } else {
                eslr m = m(bzhyVar);
                Integer num = null;
                if (m != null) {
                    int ordinal = m.ordinal();
                    if (ordinal == 2) {
                        num = Integer.valueOf(R.drawable.product_logo_chrome_color_36);
                    } else if (ordinal == 3) {
                        num = Integer.valueOf(R.drawable.product_logo_mozilla_firefox_color_36);
                    } else if (ordinal == 4) {
                        num = Integer.valueOf(R.drawable.product_logo_apple_safari_color_36);
                    } else if (ordinal == 5) {
                        num = Integer.valueOf(R.drawable.product_logo_opera_color_36);
                    } else if (ordinal == 7) {
                        num = Integer.valueOf(R.drawable.product_logo_microsoft_edge_color_36);
                    }
                }
                if (num != null) {
                    i2 = num.intValue();
                    mode = PorterDuff.Mode.DST;
                } else {
                    mode = PorterDuff.Mode.MULTIPLY;
                    i2 = R.drawable.quantum_ic_desktop_windows_white_36;
                }
            }
            appCompatImageView.setImageResource(i2);
            appCompatImageView.setImageTintMode(mode);
        } else {
            ((ekmz) this.i.b()).g(bzhyVar.k).v(appCompatImageView);
        }
        View findViewById3 = view.findViewById(R.id.paired_desktop_list_item_location);
        findViewById3.getClass();
        TextView textView2 = (TextView) findViewById3;
        String str5 = bzhyVar.j;
        if (str5 == null || str5.length() == 0) {
            textView2.setText("");
            textView2.setVisibility(8);
        } else {
            textView2.setText(bzhyVar.j);
            textView2.setVisibility(0);
        }
        View findViewById4 = view.findViewById(R.id.paired_desktop_list_item_connection_time);
        findViewById4.getClass();
        Instant instant = bzhyVar.f;
        TextView textView3 = (TextView) findViewById4;
        if (instant.compareTo(Instant.EPOCH) == 0) {
            Context context = this.f;
            textView3.setText(context.getString(R.string.paired_desktops_last_connection_time, context.getString(R.string.paired_desktops_last_connection_time_unknown)));
        } else {
            textView3.setText(this.f.getString(R.string.paired_desktops_last_connection_time, this.h.d(instant.toEpochMilli())));
        }
        View findViewById5 = view.findViewById(R.id.delete_paired_desktop_button);
        findViewById5.getClass();
        ImageView imageView = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.paired_desktop_list_item_name);
        findViewById6.getClass();
        final TextView textView4 = (TextView) findViewById6;
        imageView.setContentDescription(this.f.getResources().getString(R.string.unpair_paired_desktop_button_content_description, textView4.getText()));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: dbtu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CharSequence text = textView4.getText();
                text.getClass();
                final dbtw dbtwVar = dbtw.this;
                ((akzt) dbtwVar.e.b()).c("Bugle.Gaia.Unpair.Button.Clicked");
                ehft ehftVar = new ehft(dbtwVar.f);
                ehftVar.y(dbtwVar.f.getResources().getString(R.string.delete_paired_desktop_dialog_title));
                ehftVar.n(dbtwVar.f.getResources().getString(R.string.delete_paired_desktop_dialog_content, text));
                String string = dbtwVar.f.getResources().getString(R.string.delete_paired_desktop_positive_button_text);
                final bzhy bzhyVar2 = bzhyVar;
                ehftVar.u(string, new elbb(dbtwVar.d, "GaiaPairedDesktopsAdapter.confirm_signout", new DialogInterface.OnClickListener() { // from class: dbts
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        dbtw dbtwVar2 = dbtw.this;
                        ((akzt) dbtwVar2.e.b()).c("Bugle.Gaia.Unpair.Button.Confirmed");
                        List b = ffdx.b(bzhyVar2);
                        dbuw H = dbtwVar2.a.H();
                        ArrayList arrayList = new ArrayList(ffdx.n(b, 10));
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((bzhy) it.next()).a);
                        }
                        H.b(arrayList);
                    }
                }));
                ehftVar.p(dbtwVar.f.getResources().getString(R.string.delete_paired_desktop_negative_button_text), new elbb(dbtwVar.d, "GaiaPairedDesktopsAdapter.cancel_signout", new DialogInterface.OnClickListener() { // from class: dbtt
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ((akzt) dbtw.this.e.b()).c("Bugle.Gaia.Unpair.Button.Cancelled");
                        dialogInterface.dismiss();
                    }
                }));
                ehftVar.a();
            }
        });
    }
}
