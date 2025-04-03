package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctim {
    public static final cfup a = cfvl.c(cfvl.b, "text_classifier_entity_confidence_threshold", eobe.a);
    public static final cfup b;
    public static final cfup c;
    public static final cfup d;
    public static final cfup e;
    public static final cfup f;
    public static final cfup g;
    public static final cfup h;
    public static final cfup i;
    public static final emyl j;
    public static final emyl k;
    public static final cfup l;

    static {
        cfvl.i(cfvl.b, "enable_miniature_contact_message_annotations", false);
        b = cfvl.i(cfvl.b, "enable_text_classifier_webref_message_annotations", false);
        c = cfvl.i(cfvl.b, "enable_text_classifier_address_message_annotations", false);
        d = cfvl.i(cfvl.b, "enable_text_classifier_contact_message_annotations", false);
        e = cfvl.i(cfvl.b, "enable_text_classifier_datetime_message_annotations", false);
        f = cfvl.i(cfvl.b, "enable_text_classifier_map_link_message_annotations", false);
        g = cfvl.i(cfvl.b, "enable_text_classifier_email_message_annotations", false);
        h = cfvl.i(cfvl.b, "enable_text_classifier_phone_message_annotations", false);
        i = cfvl.i(cfvl.b, "enable_regex_message_annotations", false);
        j = cfvl.w("enable_annotations_in_example_store");
        k = cfvl.w("enable_prefix_map_link_annotations_regex");
        l = cfvl.h(cfvl.b, "map_link_annotation_regex_example_store", "(http(s?)://)?((maps\\.google\\.(\\w)+/)|(maps\\.app.goo.gl/)|((www\\.)?google\\.(\\w)+/maps[/?])|(goo.gl/maps/)).*");
    }
}
