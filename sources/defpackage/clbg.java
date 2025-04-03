package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clbg {
    IMAGE_CAPTION_NAMESPACE("urn:rcs:message:captions:"),
    REACTIONS_NAMESPACE("urn:rcs:message:reactions:"),
    EMOTIFY_REACTIONS_NAMESPACE("urn:rcs:message:reactions:emotify:"),
    EMOTIFY_STICKERS_NAMESPACE("urn:rcs:message:stickers:emotify:"),
    GOOGLE_NAMESPACE("urn:rcs:google:"),
    REPLIES_NAMESPACE("urn:rcs:message:replies:"),
    ETOUFFEE_NAMESPACE("urn:rcs:message:etouffee:"),
    PROFILES_NAMESPACE("urn:rcs:message:profile:"),
    VOICE_MOODS_NAMESPACE("urn:rcs:message:moods:"),
    RCS_EDIT_NAMESPACE("urn:rcs:message:edit:"),
    RCS_PENPAL_NAMESPACE("urn:rcs:message:penpal:"),
    GSMA_RCS_NAMESPACE("http://www.gsma.com"),
    MLS_NAMESPACE("http://www.gsma.com/rcs/mls/"),
    EMERGENCY_RCS_NAMESPACE("urn:rcs:message:ercs");

    public final String o;

    clbg(String str) {
        emxf.b(clbf.a.matcher(str).matches(), "The namespace urn has not allowed characters.");
        this.o = str;
    }
}
