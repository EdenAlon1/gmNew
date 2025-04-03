package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.evlh;
import defpackage.evlj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaEntryJsonData {

    @evlh
    @evlj(a = "custom-label")
    private String customLabel;

    @evlh
    @evlj(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
    private String label;

    @evlh
    @evlj(a = "media")
    private Media media;

    @evlh
    @evlj(a = "media-content")
    private String mediaContent;

    @evlh
    @evlj(a = "addr-uri-type")
    private String type;

    /* compiled from: PG */
    private static class Media {

        @evlh
        @evlj(a = "content")
        private String content;

        @evlh
        @evlj(a = "media-url")
        private String mediaUrl;

        @evlh
        @evlj(a = "url")
        private String url;

        private Media() {
        }
    }

    protected String getContent() {
        Media media = this.media;
        return (media == null || media.content == null) ? "" : this.media.content;
    }

    protected String getCustomLabel() {
        return this.customLabel;
    }

    protected String getLabel() {
        return this.label;
    }

    protected String getMediaContent() {
        return this.mediaContent;
    }

    protected String getType() {
        return this.type;
    }

    protected String getUrl() {
        Media media = this.media;
        if (media == null) {
            return null;
        }
        return !TextUtils.isEmpty(media.mediaUrl) ? this.media.mediaUrl : this.media.url;
    }

    public String toString() {
        return String.format("url: %s content: %s label: %s custom-label: %s media-content: %s addr-uri-type: %s", getUrl(), getContent(), this.label, this.customLabel, this.mediaContent, this.type);
    }
}
