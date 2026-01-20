package com.lwq.basil.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwq.basil.repository.EventRepository;
import com.lwq.basil.service.EventService;

@Service
public class EventServiceImpl implements EventService {
    
    @Autowired
    private EventRepository eventRepository;
}
