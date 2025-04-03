package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brbv extends dtro {
    private Uri d;
    private String e;
    private Uri f;
    private String h;
    private String i;
    private ConversationIdType a = bdgq.a;
    private long b = 0;
    private int c = 0;
    private byyz g = byyz.DEFAULT_NO_VERDICT;

    protected brbv() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationImagePartsView [messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_status: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_image_display_state: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        brps.b().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        brpl brplVar = (brpl) dtsuVar;
        aB();
        this.cL = brplVar.cU();
        if (brplVar.di(0)) {
            this.a = new ConversationIdType(brplVar.getLong(brplVar.cM(0, brps.a)));
            fY(0);
        }
        if (brplVar.di(1)) {
            this.b = brplVar.getLong(brplVar.cM(1, brps.a));
            fY(1);
        }
        if (brplVar.di(2)) {
            this.c = brplVar.getInt(brplVar.cM(2, brps.a));
            fY(2);
        }
        if (brplVar.di(3)) {
            String string = brplVar.getString(brplVar.cM(3, brps.a));
            this.d = string == null ? null : Uri.parse(string);
            fY(3);
        }
        if (brplVar.di(4)) {
            this.e = brplVar.getString(brplVar.cM(4, brps.a));
            fY(4);
        }
        if (brplVar.di(5)) {
            String string2 = brplVar.getString(brplVar.cM(5, brps.a));
            this.f = string2 != null ? Uri.parse(string2) : null;
            fY(5);
        }
        if (brplVar.di(6)) {
            byyz[] values = byyz.values();
            int i = brplVar.getInt(brplVar.cM(6, brps.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.g = values[i];
            fY(6);
        }
        if (brplVar.di(7)) {
            this.h = cuxd.a(brplVar.getString(brplVar.cM(7, brps.a)));
            fY(7);
        }
        if (brplVar.di(8)) {
            this.i = cuxs.a(brplVar.getString(brplVar.cM(8, brps.a)));
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brbv)) {
            return false;
        }
        brbv brbvVar = (brbv) obj;
        return super.aD(brbvVar.cL) && Objects.equals(this.a, brbvVar.a) && this.b == brbvVar.b && this.c == brbvVar.c && Objects.equals(this.d, brbvVar.d) && Objects.equals(this.e, brbvVar.e) && Objects.equals(this.f, brbvVar.f) && this.g == brbvVar.g && Objects.equals(this.h, brbvVar.h) && Objects.equals(this.i, brbvVar.i);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        Long valueOf = Long.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Uri uri = this.d;
        String str = this.e;
        Uri uri2 = this.f;
        byyz byyzVar = this.g;
        return Objects.hash(dtsqVar2, conversationIdType, valueOf, valueOf2, uri, str, uri2, Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal()), this.h, this.i, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationImagePartsView -- REDACTED") : a();
    }
}
