package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcuf {
    public ConversationIdType a = bdgq.a;
    public String b;
    public boolean c;
    public int d;
    public Uri e;
    public Uri f;
    public String g;
    public MediaViewerButton h;
    public ArrayList i;
    public MediaViewerButton j;
    int k;
    public int l;
    public boolean m;
    public ArrayList n;
    public boolean o;
    public boolean p;
    public String q;
    public long r;
    public boolean s;
    public boolean t;

    public final dctl a() {
        dctl dctlVar = new dctl();
        fbae.e(dctlVar);
        Bundle bundle = new Bundle();
        bundle.putString("conversation_id", this.a.a());
        bundle.putString("participant_look_up_id", this.b);
        bundle.putInt("media_viewer_position", this.d);
        bundle.putBoolean("has_star_filter", this.c);
        bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.e);
        bundle.putParcelable("photos", this.f);
        bundle.putString("content_type", this.g);
        bundle.putString("media_viewer_title", null);
        bundle.putString("media_viewer_subtitle", null);
        bundle.putParcelable("primary_button", this.h);
        bundle.putParcelableArrayList("secondary_button_list", this.i);
        bundle.putParcelable("close_button", this.j);
        bundle.putInt("opening_source", this.k);
        bundle.putInt("media_editor_type", this.l);
        bundle.putBoolean("open_in_editor", this.m);
        bundle.putBoolean("show_direct_send_viewer", this.o);
        bundle.putBoolean("show_direct_send_button", this.p);
        bundle.putString("text_caption", this.q);
        bundle.putBoolean("use_encrypted_icon", this.t);
        ArrayList<? extends Parcelable> arrayList = this.n;
        if (arrayList != null) {
            bundle.putParcelableArrayList("media_viewer_items", arrayList);
        }
        bundle.putLong("video_start_ts", this.r);
        bundle.putBoolean("start_playing_video", this.s);
        dctlVar.at(bundle);
        return dctlVar;
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        this.k = i - 1;
    }
}
