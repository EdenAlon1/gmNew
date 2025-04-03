package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdl implements cjdk {
    private static final String a;
    private static final Uri b;
    private static final Uri c;
    private static final Uri d;
    private static final Uri e;
    private static final int f;
    private final Context g;

    static {
        String str = (String) ctjd.aB.e();
        a = str;
        b = csjc.j() ? Uri.EMPTY : Uri.parse(str);
        c = Uri.parse("https://support.google.com/gemini?p=gim");
        d = Uri.parse("https://support.google.com/legal/troubleshooter/1114905?uraw=r_dbef05330e64c7ef#ts=1115658%2C13380504");
        e = Uri.parse("https://myactivity.google.com/product/gemini");
        f = R.string.penpal_conversation_name;
    }

    public cjdl(Context context) {
        context.getClass();
        this.g = context;
    }

    @Override // defpackage.cjdk
    public final int a() {
        return f;
    }

    @Override // defpackage.cjdk
    public final Uri b() {
        Uri uri = c;
        uri.getClass();
        return uri;
    }

    @Override // defpackage.cjdk
    public final Uri c() {
        Uri uri = b;
        uri.getClass();
        return uri;
    }

    @Override // defpackage.cjdk
    public final Uri d() {
        Uri uri = e;
        uri.getClass();
        return uri;
    }

    @Override // defpackage.cjdk
    public final Uri e() {
        Uri uri = d;
        uri.getClass();
        return uri;
    }

    @Override // defpackage.cjdk
    public final String f() {
        String string = this.g.getString(R.string.penpal_conversation_action_about_penpel);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String g() {
        String string = this.g.getString(R.string.penpal_conversation_action_penpal_settings);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String h() {
        String string = this.g.getString(R.string.penpal_conversation_action_report_legal_issue);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String i() {
        String str = a;
        str.getClass();
        return str;
    }

    @Override // defpackage.cjdk
    public final String j() {
        String string = this.g.getString(R.string.penpal_conversation_bard_activity);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String k() {
        String string = this.g.getString(R.string.penpal_conversation_creation_tombstone, m());
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String l() {
        String string = this.g.getString(R.string.penpal_conversation_creation_tombstone_privacy_link);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String m() {
        String string = this.g.getString(R.string.penpal_conversation_creation_tombstone_privacy_link_text);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String n() {
        String string = this.g.getString(R.string.penpal_conversation_dasher_dialog_confirm_button_text);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String o() {
        String string = this.g.getString(R.string.penpal_conversation_dasher_dialog_body);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String p() {
        String string = this.g.getString(R.string.penpal_conversation_delete_dialog_content);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String q() {
        String string = this.g.getString(R.string.penpal_conversation_delete_dialog_title);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String r() {
        return "+18339913448";
    }

    @Override // defpackage.cjdk
    public final String s() {
        String string = this.g.getString(f);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String t() {
        String string = this.g.getString(R.string.penpal_proactive_message_tombstone, u());
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String u() {
        String string = this.g.getString(R.string.penpal_proactive_message_tombstone_settings_link_text);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String v() {
        String string = this.g.getString(R.string.penpal_conversation_under_age_dialog_confirm_button_text);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String w() {
        String string = this.g.getString(R.string.penpal_conversation_under_age_dialog_body);
        string.getClass();
        return string;
    }

    @Override // defpackage.cjdk
    public final String x() {
        String string = this.g.getString(R.string.penpal_conversation_under_age_dialog_title);
        string.getClass();
        return string;
    }
}
